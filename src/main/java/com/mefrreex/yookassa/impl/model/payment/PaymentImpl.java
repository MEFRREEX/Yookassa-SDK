package com.mefrreex.yookassa.impl.model.payment;

import com.google.gson.JsonElement;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.api.model.payment.*;
import org.jetbrains.annotations.Nullable;
import lombok.Builder;

import java.util.Set;

@Builder
public class PaymentImpl implements Payment {

    private final String id;
    private final PaymentStatus status;
    private final Amount amount;
    private final Amount incomeAmount;
    private final Amount refundedAmount;
    private final String description;
    private final PaymentRecipient recipient;
    private final Object paymentMethod;
    private final String capturedAt;
    private final String createdAt;
    private final String expiresAt;
    private final Confirmation confirmation;
    private final boolean test;
    private final boolean paid;
    private final String receiptRegistration;
    private final JsonElement metadata;
    private final PaymentCancellationDetails cancellationDetails;
    private final PaymentAuthorizationDetails authorizationDetails;
    private final PaymentInvoiceDetails invoiceDetails;
    private final Set<PaymentTransfer> transfers;
    private final Object deal;
    private final String merchantCustomerId;

    public PaymentImpl(
        String id,
        PaymentStatus status,
        Amount amount,
        Amount incomeAmount,
        Amount refundedAmount,
        String description,
        PaymentRecipient recipient,
        Object paymentMethod,
        String capturedAt,
        String createdAt,
        String expiresAt,
        Confirmation confirmation,
        boolean test,
        boolean paid,
        String receiptRegistration,
        JsonElement metadata,
        PaymentCancellationDetails cancellationDetails,
        PaymentAuthorizationDetails authorizationDetails,
        PaymentInvoiceDetails invoiceDetails,
        Set<PaymentTransfer> transfers,
        Object deal,
        String merchantCustomerId
    ) {
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.incomeAmount = incomeAmount;
        this.refundedAmount = refundedAmount;
        this.description = description;
        this.recipient = recipient;
        this.paymentMethod = paymentMethod;
        this.capturedAt = capturedAt;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.confirmation = confirmation;
        this.test = test;
        this.paid = paid;
        this.receiptRegistration = receiptRegistration;
        this.metadata = metadata;
        this.cancellationDetails = cancellationDetails;
        this.authorizationDetails = authorizationDetails;
        this.invoiceDetails = invoiceDetails;
        this.transfers = transfers;
        this.deal = deal;
        this.merchantCustomerId = merchantCustomerId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public PaymentStatus getStatus() {
        return status;
    }

    @Override
    public Amount getAmount() {
        return amount;
    }

    @Override
    public @Nullable Amount getIncomeAmount() {
        return incomeAmount;
    }

    @Override
    public @Nullable Amount getRefundedAmount() {
        return refundedAmount;
    }

    @Override
    public @Nullable String getDescription() {
        return description;
    }

    @Override
    public PaymentRecipient getRecipient() {
        return recipient;
    }

    @Override
    public @Nullable Object getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public @Nullable String getCapturedAt() {
        return capturedAt;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public @Nullable String getExpiresAt() {
        return expiresAt;
    }

    @Override
    public @Nullable Confirmation getConfirmation() {
        return confirmation;
    }

    @Override
    public boolean isTest() {
        return test;
    }

    @Override
    public boolean isPaid() {
        return paid;
    }

    @Override
    public @Nullable String getReceiptRegistration() {
        return receiptRegistration;
    }

    @Override
    public @Nullable JsonElement getMetadata() {
        return metadata;
    }

    @Override
    public @Nullable PaymentCancellationDetails getCancellationDetails() {
        return cancellationDetails;
    }

    @Override
    public @Nullable PaymentAuthorizationDetails getAuthorizationDetails() {
        return authorizationDetails;
    }

    @Override
    public @Nullable PaymentInvoiceDetails getInvoiceDetails() {
        return invoiceDetails;
    }

    @Override
    public @Nullable Set<PaymentTransfer> getTransfers() {
        return transfers;
    }

    @Override
    public @Nullable Object getDeal() {
        return deal;
    }

    @Override
    public @Nullable String getMerchantCustomerId() {
        return merchantCustomerId;
    }
}
