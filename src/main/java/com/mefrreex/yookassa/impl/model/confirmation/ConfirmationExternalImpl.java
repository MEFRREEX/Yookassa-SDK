package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationExternal;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.Nullable;

public class ConfirmationExternalImpl extends ConfirmationImpl implements ConfirmationExternal {

    public ConfirmationExternalImpl(@Nullable Locale locale) {
        super(ConfirmationType.EXTERNAL, locale);
    }
}
