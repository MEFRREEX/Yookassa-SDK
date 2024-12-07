package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationRedirectImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ConfirmationRedirect extends Confirmation {
    @NotNull String getReturnUrl();

    @Nullable Boolean getEnforce();

    static ConfirmationRedirect create(@Nullable String locale, @NotNull String returnUrl) {
        return new ConfirmationRedirectImpl(locale, null, returnUrl);
    }

    static ConfirmationRedirect create(@Nullable String locale, @Nullable Boolean enforce, @NotNull String returnUrl) {
        return new ConfirmationRedirectImpl(locale, enforce, returnUrl);
    }
}
