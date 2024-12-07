package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.api.model.payment.CreatePaymentRequest;
import com.mefrreex.yookassa.api.model.payment.PaymentRecipient;
import org.jetbrains.annotations.Nullable;
import lombok.Builder;

@Builder
public class CreatePaymentRequestImpl implements CreatePaymentRequest {

    private final Amount amount;
    private final String description;
    private final PaymentRecipient recipient;
    private final String paymentToken;
    private final String paymentMethodId;
    private final String paymentMethodData;
    private final Confirmation confirmation;

    public CreatePaymentRequestImpl(
        Amount amount,
        @Nullable String description,
        @Nullable PaymentRecipient recipient,
        @Nullable String paymentToken,
        @Nullable String paymentMethodId,
        @Nullable String paymentMethodData,
        @Nullable Confirmation confirmation
    ) {
        this.amount = amount;
        this.description = description;
        this.recipient = recipient;
        this.paymentToken = paymentToken;
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodData = paymentMethodData;
        this.confirmation = confirmation;
    }

    @Override
    public Amount getAmount() {
        return amount;
    }

    @Override
    public @Nullable String getDescription() {
        return description;
    }

    @Override
    public @Nullable PaymentRecipient getRecipient() {
        return recipient;
    }

    @Override
    public @Nullable String getPaymentToken() {
        return paymentToken;
    }

    @Override
    public @Nullable String getPaymentMethodId() {
        return paymentMethodId;
    }

    @Override
    public @Nullable String getPaymentMethodData() {
        return paymentMethodData;
    }

    @Override
    public @Nullable Confirmation getConfirmation() {
        return confirmation;
    }
}
