package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationRedirectImpl;
import org.jetbrains.annotations.Nullable;

public interface ConfirmationRedirect extends Confirmation {
    @Nullable String getReturnUrl();

    @Nullable String getConfirmationUrl();

    @Nullable Boolean getEnforce();

    static ConfirmationRedirect create(@Nullable String locale, @Nullable String returnUrl) {
        return new ConfirmationRedirectImpl(locale, null, returnUrl, null);
    }

    static ConfirmationRedirect create(@Nullable String locale, @Nullable Boolean enforce, @Nullable String returnUrl) {
        return new ConfirmationRedirectImpl(locale, enforce, returnUrl, null);
    }

    static ConfirmationRedirect create(@Nullable String locale, @Nullable Boolean enforce, @Nullable String returnUrl, @Nullable String confirmationUrl) {
        return new ConfirmationRedirectImpl(locale, enforce, returnUrl, confirmationUrl);
    }
}
