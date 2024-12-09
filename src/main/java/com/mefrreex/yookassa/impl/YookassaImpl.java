package com.mefrreex.yookassa.impl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mefrreex.yookassa.api.Yookassa;
import com.mefrreex.yookassa.api.model.payment.CreatePaymentRequest;
import com.mefrreex.yookassa.api.model.payment.GetPaymentsRequest;
import com.mefrreex.yookassa.api.model.payment.Payment;
import com.mefrreex.yookassa.api.model.payment.PaymentList;
import com.mefrreex.yookassa.exception.YookassaApiException;
import com.mefrreex.yookassa.exception.YookassaClientException;
import com.mefrreex.yookassa.utils.HttpMethod;
import com.mefrreex.yookassa.utils.gson.GsonUtil;
import org.jetbrains.annotations.Nullable;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class YookassaImpl implements Yookassa {

    private final int shopIdentifier;
    private final String shopToken;

    public YookassaImpl(int shopIdentifier, String shopToken) {
        if (shopIdentifier == 0 || shopToken == null || shopToken.isBlank()) {
            throw new YookassaClientException("No credentials are specified");
        }
        this.shopIdentifier = shopIdentifier;
        this.shopToken = shopToken;
    }

    @Override
    public int getShopIdentifier() {
        return shopIdentifier;
    }

    @Override
    public String getShopToken() {
        return shopToken;
    }

    @Override
    public Payment createPayment(CreatePaymentRequest request) {
        return this.sendRequest(Payment.class, "https://api.yookassa.ru/v3/payments", HttpMethod.POST, GsonUtil.toJson(request));
    }

    @Override
    public Payment getPayment(UUID id) {
        return this.sendRequest(Payment.class, "https://api.yookassa.ru/v3/payments/" + id, HttpMethod.GET, null);
    }

    @Override
    public PaymentList getPayments(GetPaymentsRequest request) {
        return this.sendRequest(PaymentList.class, "https://api.yookassa.ru/v3/payments", HttpMethod.GET, GsonUtil.toJson(request));
    }

    private <T> T sendRequest(Class<T> responseType, String endpoint, HttpMethod method, @Nullable String body) {
        OkHttpClient client = new OkHttpClient();

        String credentials = shopIdentifier + ":" + shopToken;
        String basicAuth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));

        if (method == HttpMethod.GET && body != null) {
            try {
                JsonObject jsonObject = JsonParser.parseString(body).getAsJsonObject();
                HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(endpoint)).newBuilder();
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    urlBuilder.addQueryParameter(entry.getKey(), entry.getValue().getAsString());
                }
                endpoint = urlBuilder.build().toString();
            } catch (JsonSyntaxException e) {
                throw new IllegalArgumentException("Invalid JSON body for GET request: " + body, e);
            }
        }

        Request.Builder requestBuilder = new Request.Builder()
                .url(endpoint)
                .header("Authorization", basicAuth);

        if (method == HttpMethod.POST || method == HttpMethod.PUT) {
            if (body != null) {
                RequestBody requestBody = RequestBody.create(body, MediaType.get("application/json"));
                requestBuilder
                        .header("Idempotence-Key", UUID.randomUUID().toString())
                        .header("Content-Type", "application/json")
                        .method(method.toString(), requestBody);
            } else {
                requestBuilder.method(method.toString(), RequestBody.create(new byte[0], null));
            }
        } else {
            requestBuilder.method(method.toString(), null);
        }

        try (Response response = client.newCall(requestBuilder.build()).execute()) {
            String responseBody = response.body() != null ? response.body().string() : "No error response body";

            if (!response.isSuccessful()) {
                try {
                    JsonObject errorJson = JsonParser.parseString(responseBody).getAsJsonObject();
                    String type = errorJson.has("type") ? errorJson.get("type").getAsString() : null;
                    String id = errorJson.has("id") ? errorJson.get("id").getAsString() : null;
                    String code = errorJson.has("code") ? errorJson.get("code").getAsString() : null;
                    String description = errorJson.has("description") ? errorJson.get("description").getAsString() : null;
                    String parameter = errorJson.has("parameter") ? errorJson.get("parameter").getAsString() : null;

                    throw new YookassaApiException(type, id, code, description, parameter, endpoint);
                } catch (JsonSyntaxException e) {
                    throw new RuntimeException("Invalid error response format: " + responseBody, e);
                }
            }

            return responseType != null ? GsonUtil.fromJson(responseBody, responseType) : null;
        } catch (IOException e) {
            throw new YookassaClientException("Error during HTTP request", e);
        }
    }
}
