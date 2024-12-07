package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationMobileApplicationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ConfirmationMobileApplication extends Confirmation {
    @NotNull String getReturnUrl();

    static ConfirmationMobileApplication create(@Nullable String locale, @NotNull String returnUrl) {
        return new ConfirmationMobileApplicationImpl(locale, returnUrl);
    }
}
