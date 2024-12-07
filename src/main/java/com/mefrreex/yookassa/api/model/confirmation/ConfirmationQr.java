package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationQrImpl;
import org.jetbrains.annotations.Nullable;

public interface ConfirmationQr extends Confirmation {
    @Nullable String getReturnUrl();

    static ConfirmationQr create(@Nullable String locale, @Nullable String returnUrl) {
        return new ConfirmationQrImpl(locale, returnUrl);
    }
}
