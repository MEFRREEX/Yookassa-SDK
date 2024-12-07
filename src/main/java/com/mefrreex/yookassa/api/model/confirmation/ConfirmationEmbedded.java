package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationEmbeddedImpl;
import org.jetbrains.annotations.Nullable;

public interface ConfirmationEmbedded extends Confirmation {

    static ConfirmationEmbedded create(@Nullable String locale) {
        return new ConfirmationEmbeddedImpl(locale);
    }
}
