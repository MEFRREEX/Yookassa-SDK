package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationQrImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(ConfirmationQrImpl.class)
public interface ConfirmationQr extends Confirmation {
    @Nullable String getReturnUrl();

    @Nullable String getConfirmationData();

    static ConfirmationQr create(@Nullable String locale, @Nullable String returnUrl) {
        return new ConfirmationQrImpl(locale, returnUrl, null);
    }

    static ConfirmationQr create(@Nullable String locale, @Nullable String returnUrl, @Nullable String confirmationData) {
        return new ConfirmationQrImpl(locale, returnUrl, confirmationData);
    }
}
