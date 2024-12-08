package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationEmbeddedImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(ConfirmationEmbeddedImpl.class)
public interface ConfirmationEmbedded extends Confirmation {

    @Nullable String getConfirmationToken();

    static ConfirmationEmbedded create(@Nullable Locale locale) {
        return new ConfirmationEmbeddedImpl(locale, null);
    }

    static ConfirmationEmbedded create(@Nullable Locale locale, @Nullable String confirmationToken) {
        return new ConfirmationEmbeddedImpl(locale, confirmationToken);
    }
}
