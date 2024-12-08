package com.mefrreex.yookassa.impl.model.payment;

import com.google.gson.annotations.SerializedName;
import com.mefrreex.yookassa.api.model.payment.GetPaymentsRequest;
import com.mefrreex.yookassa.api.model.payment.PaymentStatus;
import lombok.Builder;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;

@Builder
public class GetPaymentsRequestImpl implements GetPaymentsRequest {
    private final @SerializedName("created_at.gte") Instant createdAtGte;
    private final @SerializedName("created_at.gt") Instant createdAtGt;
    private final @SerializedName("created_at.lte") Instant createdAtLte;
    private final @SerializedName("created_at.lt") Instant createdAtLt;
    private final @SerializedName("captured_at.gte") Instant capturedAtGte;
    private final @SerializedName("captured_at.gt") Instant capturedAtGt;
    private final @SerializedName("captured_at.lte") Instant capturedAtLte;
    private final @SerializedName("captured_at.lt") Instant capturedAtLt;
    private final String paymentMethod;
    private final PaymentStatus status;
    private final Integer limit;
    private final String cursor;

    public GetPaymentsRequestImpl(
        @Nullable Instant createdAtGte,
        @Nullable Instant createdAtGt,
        @Nullable Instant createdAtLte,
        @Nullable Instant createdAtLt,
        @Nullable Instant capturedAtGte,
        @Nullable Instant capturedAtGt,
        @Nullable Instant capturedAtLte,
        @Nullable Instant capturedAtLt,
        @Nullable String paymentMethod,
        @Nullable PaymentStatus status,
        @Nullable Integer limit,
        @Nullable String cursor
    ) {
        this.createdAtGte = createdAtGte;
        this.createdAtGt = createdAtGt;
        this.createdAtLte = createdAtLte;
        this.createdAtLt = createdAtLt;
        this.capturedAtGte = capturedAtGte;
        this.capturedAtGt = capturedAtGt;
        this.capturedAtLte = capturedAtLte;
        this.capturedAtLt = capturedAtLt;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.limit = limit;
        this.cursor = cursor;
    }

    @Override
    public @Nullable Instant getCreatedAtGte() {
        return createdAtGte;
    }

    @Override
    public @Nullable Instant getCreatedAtGt() {
        return createdAtGt;
    }

    @Override
    public @Nullable Instant getCreatedAtLte() {
        return createdAtLte;
    }

    @Override
    public @Nullable Instant getCreatedAtLt() {
        return createdAtLt;
    }

    @Override
    public @Nullable Instant getCapturedAtGte() {
        return capturedAtGte;
    }

    @Override
    public @Nullable Instant getCapturedAtGt() {
        return capturedAtGt;
    }

    @Override
    public @Nullable Instant getCapturedAtLte() {
        return capturedAtLte;
    }

    @Override
    public @Nullable Instant getCapturedAtLt() {
        return capturedAtLt;
    }

    @Override
    public @Nullable String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public @Nullable PaymentStatus getStatus() {
        return status;
    }

    @Override
    public @Nullable Integer getLimit() {
        return limit;
    }

    @Override
    public @Nullable String getCursor() {
        return cursor;
    }
}
