package com.mefrreex.yookassa.impl.model.confirmation;

import com.google.gson.annotations.SerializedName;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationMobileApplication;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.NotNull;

public class ConfirmationMobileApplicationImpl extends ConfirmationImpl implements ConfirmationMobileApplication {

    @SerializedName("return_url")
    private final String returnUrl;

    public ConfirmationMobileApplicationImpl(String locale, @NotNull String returnUrl) {
        super(ConfirmationType.MOBILE_APPLICATION, locale);
        this.returnUrl = returnUrl;
    }

    @Override
    public @NotNull String getReturnUrl() {
        return returnUrl;
    }
}
