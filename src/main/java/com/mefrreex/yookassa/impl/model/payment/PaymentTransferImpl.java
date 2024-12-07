package com.mefrreex.yookassa.impl.model.payment;

import com.google.gson.JsonElement;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.payment.PaymentStatus;
import com.mefrreex.yookassa.api.model.payment.PaymentTransfer;
import org.jetbrains.annotations.Nullable;

public class PaymentTransferImpl implements PaymentTransfer {

    private final String accountId;
    private final PaymentStatus status;
    private final Amount amount;
    private final Amount platformFeeAmount;
    private final String description;
    private final JsonElement metadata;

    public PaymentTransferImpl(
        String accountId,
        PaymentStatus status,
        Amount amount,
        @Nullable Amount platformFeeAmount,
        @Nullable String description,
        @Nullable JsonElement metadata
    ) {
        this.accountId = accountId;
        this.status = status;
        this.amount = amount;
        this.platformFeeAmount = platformFeeAmount;
        this.description = description;
        this.metadata = metadata;
    }

    @Override
    public String getAccountId() {
        return accountId;
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
    public @Nullable Amount getPlatformFeeAmount() {
        return platformFeeAmount;
    }

    @Override
    public @Nullable String getDescription() {
        return description;
    }

    @Override
    public @Nullable JsonElement getMetadata() {
        return metadata;
    }
}
