package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.confirmation.ConfirmationQr;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.Nullable;

public class ConfirmationQrImpl extends ConfirmationImpl implements ConfirmationQr {

    private final String returnUrl;
    private final String confirmationData;

    public ConfirmationQrImpl(String locale, @Nullable String returnUrl, @Nullable String confirmationData) {
        super(ConfirmationType.QR, locale);
        this.returnUrl = returnUrl;
        this.confirmationData = confirmationData;
    }

    @Override
    public @Nullable String getReturnUrl() {
        return returnUrl;
    }

    @Override
    public @Nullable String getConfirmationData() {
        return confirmationData;
    }
}
