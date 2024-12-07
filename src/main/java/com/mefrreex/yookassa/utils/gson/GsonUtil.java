package com.mefrreex.yookassa.utils.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.utils.gson.adapter.ConfirmationAdapter;
import com.mefrreex.yookassa.utils.gson.adapter.factory.ImplementationAdapterFactory;
import lombok.Getter;

public class GsonUtil {

    @Getter
    private static final Gson gson = new GsonBuilder()
            .setFieldNamingStrategy(field -> {
                String fieldName = field.getName();
                StringBuilder snakeCaseName = new StringBuilder();

                for (int i = 0; i < fieldName.length(); i++) {
                    char c = fieldName.charAt(i);
                    if (Character.isUpperCase(c)) {
                        if (i > 0) {
                            snakeCaseName.append('_');
                        }
                        snakeCaseName.append(Character.toLowerCase(c));
                    } else {
                        snakeCaseName.append(c);
                    }
                }

                return snakeCaseName.toString();
            })
            .registerTypeAdapterFactory(new ImplementationAdapterFactory())
            .registerTypeAdapter(Confirmation.class, new ConfirmationAdapter())
            .create();

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
