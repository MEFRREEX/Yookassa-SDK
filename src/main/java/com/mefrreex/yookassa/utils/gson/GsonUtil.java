package com.mefrreex.yookassa.utils.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.utils.gson.adapter.ConfirmationAdapter;
import com.mefrreex.yookassa.utils.gson.adapter.InstantAdapter;
import com.mefrreex.yookassa.utils.gson.adapter.factory.ImplementationAdapterFactory;
import com.mefrreex.yookassa.utils.gson.strategy.SnakeCaseFieldNamingStrategy;
import lombok.Getter;

import java.time.Instant;

public class GsonUtil {

    @Getter
    private static final Gson gson = new GsonBuilder()
            .setFieldNamingStrategy(new SnakeCaseFieldNamingStrategy())
            .registerTypeAdapterFactory(new ImplementationAdapterFactory())
            .registerTypeAdapter(Instant.class, new InstantAdapter())
            .registerTypeAdapter(Confirmation.class, new ConfirmationAdapter())
            .create();

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
