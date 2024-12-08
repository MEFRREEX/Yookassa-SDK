package com.mefrreex.yookassa.impl.model.confirmation;

import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationMobileApplication;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import org.jetbrains.annotations.Nullable;

public class ConfirmationMobileApplicationImpl extends ConfirmationImpl implements ConfirmationMobileApplication {

    private final String returnUrl;
    private final String confirmationUrl;

    public ConfirmationMobileApplicationImpl(@Nullable Locale locale, @Nullable String returnUrl, @Nullable String confirmationUrl) {
        super(ConfirmationType.MOBILE_APPLICATION, locale);
        this.returnUrl = returnUrl;
        this.confirmationUrl = confirmationUrl;
    }

    @Override
    public @Nullable String getReturnUrl() {
        return returnUrl;
    }

    @Override
    public @Nullable String getConfirmationUrl() {
        return confirmationUrl;
    }
}
