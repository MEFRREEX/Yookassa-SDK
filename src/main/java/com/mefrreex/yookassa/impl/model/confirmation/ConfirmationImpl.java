package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConfirmationImpl implements Confirmation {

    private final ConfirmationType type;
    private final Locale locale;

    public ConfirmationImpl(ConfirmationType type, @Nullable Locale locale) {
        this.type = type;
        this.locale = locale;
    }

    @Override
    public @NotNull ConfirmationType getType() {
        return type;
    }

    @Override
    public @Nullable Locale getLocale() {
        return locale;
    }
}
