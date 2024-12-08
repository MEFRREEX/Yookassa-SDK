package com.mefrreex.yookassa.api.model.confirmation;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum ConfirmationType {
    @SerializedName("embedded") EMBEDDED("embedded"),
    @SerializedName("external") EXTERNAL("external"),
    @SerializedName("mobile_application") MOBILE_APPLICATION("mobile_application"),
    @SerializedName("qr") QR("qr"),
    @SerializedName("redirect") REDIRECT("redirect");

    private final String name;

    private static final Map<String, ConfirmationType> BY_NAME = Stream.of(values())
            .collect(Collectors.toUnmodifiableMap(type -> type.name.toLowerCase(), type -> type));

    public static ConfirmationType getByName(@NotNull String name) {
        return BY_NAME.get(Objects.requireNonNull(name).toLowerCase());
    }
}
