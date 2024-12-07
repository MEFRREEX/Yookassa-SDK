package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.confirmation.ConfirmationEmbedded;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;

public class ConfirmationEmbeddedImpl extends ConfirmationImpl implements ConfirmationEmbedded {

    public ConfirmationEmbeddedImpl(String locale) {
        super(ConfirmationType.EMBEDDED, locale);
    }
}
