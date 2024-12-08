package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationRedirect;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(ConfirmationRedirect.class)
public class ConfirmationRedirectImpl extends ConfirmationImpl implements ConfirmationRedirect {

    private final Boolean enforce;
    private final String returnUrl;
    private final String confirmationUrl;

    public ConfirmationRedirectImpl(@Nullable Locale locale, @Nullable Boolean enforce, @Nullable String returnUrl, @Nullable String confirmationUrl) {
        super(ConfirmationType.REDIRECT, locale);
        this.enforce = enforce;
        this.returnUrl = returnUrl;
        this.confirmationUrl = confirmationUrl;
    }

    @Override
    public @Nullable Boolean getEnforce() {
        return enforce;
    }

    @Override
    public @Nullable String getReturnUrl() {
        return returnUrl;
    }

    @Override
    public @Nullable String getConfirmationUrl() {
        return confirmationUrl;
    }
}
