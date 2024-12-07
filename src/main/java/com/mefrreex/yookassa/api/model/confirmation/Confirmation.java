package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Implementation(ConfirmationImpl.class)
public interface Confirmation {
    @NotNull String getType();

    @Nullable String getLocale();
}
