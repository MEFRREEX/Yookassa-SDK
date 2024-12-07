package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationExternalImpl;
import org.jetbrains.annotations.Nullable;

public interface ConfirmationExternal extends Confirmation {

    static ConfirmationExternal create(@Nullable String locale) {
        return new ConfirmationExternalImpl(locale);
    }
}
