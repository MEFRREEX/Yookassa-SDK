package com.mefrreex.yookassa.api.model.payment;

import com.google.gson.JsonElement;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.impl.model.payment.PaymentTransferImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(PaymentTransferImpl.class)
public interface PaymentTransfer {
    String getAccountId();

    PaymentStatus getStatus();

    Amount getAmount();

    @Nullable Amount getPlatformFeeAmount();

    @Nullable String getDescription();

    @Nullable JsonElement getMetadata();

    static PaymentTransfer create(
        String accountId,
        PaymentStatus status,
        Amount amount,
        @Nullable Amount platformFeeAmount,
        @Nullable String description,
        @Nullable JsonElement metadata
    ) {
        return new PaymentTransferImpl(accountId, status, amount, platformFeeAmount, description, metadata);
    }
}
