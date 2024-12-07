package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.confirmation.ConfirmationEmbedded;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.Nullable;

public class ConfirmationEmbeddedImpl extends ConfirmationImpl implements ConfirmationEmbedded {

    private final String confirmationToken;

    public ConfirmationEmbeddedImpl(String locale, @Nullable String confirmationToken) {
        super(ConfirmationType.EMBEDDED, locale);
        this.confirmationToken = confirmationToken;
    }

    @Override
    public @Nullable String getConfirmationToken() {
        return confirmationToken;
    }
}
