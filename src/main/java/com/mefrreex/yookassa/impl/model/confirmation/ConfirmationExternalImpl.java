package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.confirmation.ConfirmationExternal;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;

public class ConfirmationExternalImpl extends ConfirmationImpl implements ConfirmationExternal {

    public ConfirmationExternalImpl(String locale) {
        super(ConfirmationType.EXTERNAL, locale);
    }
}
