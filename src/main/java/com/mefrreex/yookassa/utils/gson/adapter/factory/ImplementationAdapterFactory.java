package com.mefrreex.yookassa.utils.gson.adapter.factory;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;

public class ImplementationAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        if (!type.getRawType().isInterface()) {
            return null;
        }

        Class<?> rawType = type.getRawType();

        Implementation annotation = rawType.getAnnotation(Implementation.class);
        if (annotation == null) {
            return null;
        }

        Class<?> implementationType = annotation.value();
        TypeAdapter<?> delegate = gson.getAdapter(TypeToken.get(implementationType));
        return (TypeAdapter<T>) delegate;
    }
}

