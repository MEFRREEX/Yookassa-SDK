package com.mefrreex.yookassa.impl;

import com.mefrreex.yookassa.api.Yookassa;
import com.mefrreex.yookassa.api.model.payment.CreatePaymentRequest;
import com.mefrreex.yookassa.api.model.payment.Payment;
import com.mefrreex.yookassa.exception.YookassaRequestException;
import com.mefrreex.yookassa.utils.HttpMethod;
import com.mefrreex.yookassa.utils.gson.GsonUtil;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class YookassaImpl implements Yookassa {

    private final int shopIdentifier;
    private final String shopToken;

    public YookassaImpl(int shopIdentifier, String shopToken) {
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

    private <T> T sendRequest(Class<T> responseType, String endpoint, HttpMethod method, String body) {
        OkHttpClient client = new OkHttpClient();

        String credentials = shopIdentifier + ":" + shopToken;
        String basicAuth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));

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
            if (!response.isSuccessful()) {
                String errorResponse = response.body() != null ? response.body().string() : "No error response body";
                throw new RuntimeException(errorResponse);
            }

            if (responseType == null) return null;

            String responseBody = response.body() != null ? response.body().string() : "";
            return GsonUtil.fromJson(responseBody, responseType);
        } catch (IOException e) {
            throw new YookassaRequestException("Error during HTTP request", e);
        }
    }
}
