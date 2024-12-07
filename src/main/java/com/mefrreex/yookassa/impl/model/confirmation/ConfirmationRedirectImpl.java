package com.mefrreex.yookassa.impl.model.confirmation;

import com.google.gson.annotations.SerializedName;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationRedirect;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConfirmationRedirectImpl extends ConfirmationImpl implements ConfirmationRedirect {

    private final Boolean enforce;

    @SerializedName("return_url")
    private final String returnUrl;

    public ConfirmationRedirectImpl(String locale, Boolean enforce, String returnUrl) {
        super(ConfirmationType.REDIRECT, locale);
        this.enforce = enforce;
        this.returnUrl = returnUrl;
    }

    @Override
    public @Nullable Boolean getEnforce() {
        return enforce;
    }

    @Override
    public @NotNull String getReturnUrl() {
        return returnUrl;
    }
}
