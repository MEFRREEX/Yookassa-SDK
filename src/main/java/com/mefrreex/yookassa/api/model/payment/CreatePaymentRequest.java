package com.mefrreex.yookassa.api.model.payment;

import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.impl.model.payment.CreatePaymentRequestImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(CreatePaymentRequestImpl.class)
public interface CreatePaymentRequest {
    Amount getAmount();

    @Nullable String getDescription();

    @Nullable PaymentRecipient getRecipient();

    @Nullable String getPaymentToken();

    @Nullable String getPaymentMethodId();

    @Nullable String getPaymentMethodData();

    @Nullable Confirmation getConfirmation();

    static CreatePaymentRequest create(
        Amount amount,
        @Nullable String description,
        @Nullable PaymentRecipient recipient,
        @Nullable String paymentToken,
        @Nullable String paymentMethodId,
        @Nullable String paymentMethodData,
        @Nullable Confirmation confirmation
    ) {
        return new CreatePaymentRequestImpl(
            amount,
            description,
            recipient,
            paymentToken,
            paymentMethodId,
            paymentMethodData,
            confirmation
        );
    }

    static CreatePaymentRequestImpl.CreatePaymentRequestImplBuilder builder() {
        return CreatePaymentRequestImpl.builder();
    }
}
