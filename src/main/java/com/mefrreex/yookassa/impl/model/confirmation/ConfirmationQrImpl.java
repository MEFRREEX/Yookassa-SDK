package com.mefrreex.yookassa.impl.model.confirmation;

import com.google.gson.annotations.SerializedName;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationQr;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.Nullable;

public class ConfirmationQrImpl extends ConfirmationImpl implements ConfirmationQr {

    @SerializedName("return_url")
    private final String returnUrl;

    public ConfirmationQrImpl(String locale, @Nullable String returnUrl) {
        super(ConfirmationType.QR, locale);
        this.returnUrl = returnUrl;
    }

    @Override
    public @Nullable String getReturnUrl() {
        return returnUrl;
    }
}
