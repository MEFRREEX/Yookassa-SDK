package com.mefrreex.yookassa.utils.gson.strategy;

import com.google.gson.FieldNamingStrategy;

import java.lang.reflect.Field;

public class SnakeCaseFieldNamingStrategy implements FieldNamingStrategy {

    @Override
    public String translateName(Field field) {
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
    }
}
