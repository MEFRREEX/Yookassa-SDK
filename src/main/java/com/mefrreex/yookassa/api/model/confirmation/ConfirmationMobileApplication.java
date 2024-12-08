package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationMobileApplicationImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(ConfirmationMobileApplicationImpl.class)
public interface ConfirmationMobileApplication extends Confirmation {
    @Nullable String getReturnUrl();

    @Nullable String getConfirmationUrl();

    static ConfirmationMobileApplication create(@Nullable Locale locale, @Nullable String returnUrl) {
        return new ConfirmationMobileApplicationImpl(locale, returnUrl, null);
    }

    static ConfirmationMobileApplication create(@Nullable Locale locale, @Nullable String returnUrl, @Nullable String  confirmationUrl) {
        return new ConfirmationMobileApplicationImpl(locale, returnUrl, confirmationUrl);
    }
}
