package com.mefrreex.yookassa.api.model.confirmation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Confirmation {
    @NotNull String getType();

    @Nullable String getLocale();
}
