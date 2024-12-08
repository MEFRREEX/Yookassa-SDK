package com.mefrreex.yookassa.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Locale {
    @SerializedName("ru_RU") RUSSIAN("ru_RU"),
    @SerializedName("en_US") ENGLISH("en_US");

    private final String code;
}
