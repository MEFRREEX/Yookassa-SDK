package com.mefrreex.yookassa.api.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.impl.model.confirmation.ConfirmationExternalImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(ConfirmationExternalImpl.class)
public interface ConfirmationExternal extends Confirmation {

    static ConfirmationExternal create(@Nullable Locale locale) {
        return new ConfirmationExternalImpl(locale);
    }
}
