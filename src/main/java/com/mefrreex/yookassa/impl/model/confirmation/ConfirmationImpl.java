package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConfirmationImpl implements Confirmation {

    private final String type;
    private final String locale;

    public ConfirmationImpl(String type, String locale) {
        this.type = type;
        this.locale = locale;
    }

    @Override
    public @NotNull String getType() {
        return type;
    }

    @Override
    public @Nullable String getLocale() {
        return locale;
    }
}
