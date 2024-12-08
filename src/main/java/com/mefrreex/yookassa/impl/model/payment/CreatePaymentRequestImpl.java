package com.mefrreex.yookassa.impl.model.payment;

import com.google.gson.JsonElement;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.api.model.payment.CreatePaymentRequest;
import com.mefrreex.yookassa.api.model.payment.PaymentReceiver;
import com.mefrreex.yookassa.api.model.payment.PaymentRecipient;
import com.mefrreex.yookassa.api.model.payment.PaymentTransfer;
import org.jetbrains.annotations.Nullable;
import lombok.Builder;

import java.util.Set;

@Builder
public class CreatePaymentRequestImpl implements CreatePaymentRequest {

    private final Amount amount;
    private final String description;
    private final PaymentRecipient recipient;
    private final PaymentReceiver receiver;
    private final String paymentToken;
    private final String paymentMethodId;
    private final String paymentMethodData;
    private final Confirmation confirmation;
    private final Boolean savePaymentMethod;
    private final Boolean capture;
    private final String clientIp;
    private final JsonElement metadata;
    private final Set<PaymentTransfer> transfers;
    private final String merchantCustomerId;

    public CreatePaymentRequestImpl(
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
        this.amount = amount;
        this.description = description;
        this.recipient = recipient;
        this.receiver = receiver;
        this.paymentToken = paymentToken;
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodData = paymentMethodData;
        this.confirmation = confirmation;
        this.savePaymentMethod = savePaymentMethod;
        this.capture = capture;
        this.clientIp = clientIp;
        this.metadata = metadata;
        this.transfers = transfers;
        this.merchantCustomerId = merchantCustomerId;
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
    public @Nullable PaymentReceiver getReceiver() {
        return receiver;
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

    @Override
    public @Nullable Boolean getSavePaymentMethod() {
        return savePaymentMethod;
    }

    @Override
    public @Nullable Boolean getCapture() {
        return capture;
    }

    @Override
    public @Nullable String getClientIp() {
        return clientIp;
    }

    @Override
    public @Nullable JsonElement getMetadata() {
        return metadata;
    }

    @Override
    public @Nullable Set<PaymentTransfer> getTransfers() {
        return transfers;
    }

    @Override
    public @Nullable String getMerchantCustomerId() {
        return merchantCustomerId;
    }
}
