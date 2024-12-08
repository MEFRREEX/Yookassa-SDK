package com.mefrreex.yookassa.api.model.payment;

import com.google.gson.JsonElement;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.impl.model.payment.CreatePaymentRequestImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

@Implementation(CreatePaymentRequestImpl.class)
public interface CreatePaymentRequest {
    Amount getAmount();

    @Nullable String getDescription();

    @Nullable PaymentRecipient getRecipient();

    @Nullable PaymentReceiver getReceiver();

    @Nullable String getPaymentToken();

    @Nullable String getPaymentMethodId();

    @Nullable String getPaymentMethodData();

    @Nullable Confirmation getConfirmation();

    @Nullable Boolean getSavePaymentMethod();

    @Nullable Boolean getCapture();

    @Nullable String getClientIp();

    @Nullable JsonElement getMetadata();

    @Nullable Set<PaymentTransfer> getTransfers();

    @Nullable String getMerchantCustomerId();

    static CreatePaymentRequest create(
        Amount amount,
        @Nullable String description,
        @Nullable PaymentRecipient recipient,
        @Nullable PaymentReceiver receiver,
        @Nullable String paymentToken,
        @Nullable String paymentMethodId,
        @Nullable String paymentMethodData,
        @Nullable Confirmation confirmation,
        @Nullable Boolean savePaymentMethod,
        @Nullable Boolean capture,
        @Nullable String clientIp,
        @Nullable JsonElement metadata,
        @Nullable Set<PaymentTransfer> transfers,
        @Nullable String merchantCustomerId
    ) {
        return new CreatePaymentRequestImpl(
            amount,
            description,
            recipient,
            receiver,
            paymentToken,
            paymentMethodId,
            paymentMethodData,
            confirmation,
            savePaymentMethod,
            capture,
            clientIp,
            metadata,
            transfers,
            merchantCustomerId
        );
    }

    static CreatePaymentRequestImpl.CreatePaymentRequestImplBuilder builder() {
        return CreatePaymentRequestImpl.builder();
    }
}
