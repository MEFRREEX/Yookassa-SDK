package com.mefrreex.yookassa.api.model.payment;

import com.google.gson.JsonElement;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.impl.model.payment.PaymentImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

@Implementation(PaymentImpl.class)
public interface Payment {
    String getId();

    PaymentStatus getStatus();

    Amount getAmount();

    @Nullable Amount getIncomeAmount();

    @Nullable Amount getRefundedAmount();

    @Nullable String getDescription();

    PaymentRecipient getRecipient();

    @Nullable Object getPaymentMethod(); // TODO make payment method class

    @Nullable String getCapturedAt();

    String getCreatedAt();

    @Nullable String getExpiresAt();

    @Nullable Confirmation getConfirmation();

    boolean isTest();

    boolean isPaid();

    @Nullable String getReceiptRegistration();

    @Nullable JsonElement getMetadata();

    @Nullable PaymentCancellationDetails getCancellationDetails();

    @Nullable PaymentAuthorizationDetails getAuthorizationDetails();

    @Nullable Set<PaymentTransfer> getTransfers();

    @Nullable Object getDeal();  // TODO make payment deal class

    @Nullable String getMerchantCustomerId();

    @Nullable Object getInvoiceDetails(); // TODO make invoice details class

    static Payment create(
        String id,
        PaymentStatus status,
        Amount amount,
        @Nullable Amount incomeAmount,
        @Nullable Amount refundedAmount,
        @Nullable String description,
        PaymentRecipient recipient,
        @Nullable Object paymentMethod,
        @Nullable String capturedAt,
        String createdAt,
        @Nullable String expiresAt,
        @Nullable Confirmation confirmation,
        boolean test,
        boolean paid,
        @Nullable String receiptRegistration,
        @Nullable JsonElement metadata,
        @Nullable PaymentCancellationDetails cancellationDetails,
        @Nullable PaymentAuthorizationDetails authorizationDetails,
        @Nullable Set<PaymentTransfer> transfers,
        @Nullable Object deal,
        @Nullable String merchantCustomerId,
        @Nullable Object invoiceDetails
    ) {
        return new PaymentImpl(
            id,
            status,
            amount,
            incomeAmount,
            refundedAmount,
            description,
            recipient,
            paymentMethod,
            capturedAt,
            createdAt,
            expiresAt,
            confirmation,
            test,
            paid,
            receiptRegistration,
            metadata,
            cancellationDetails,
            authorizationDetails,
            transfers,
            deal,
            merchantCustomerId,
            invoiceDetails
        );
    }

    static PaymentImpl.PaymentImplBuilder builder() {
        return PaymentImpl.builder();
    }
}
