package com.mefrreex.yookassa.api.model.payment;


import com.mefrreex.yookassa.impl.model.payment.GetPaymentsRequestImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;

@Implementation(GetPaymentsRequestImpl.class)
public interface GetPaymentsRequest {
    @Nullable Instant getCreatedAtGte();

    @Nullable Instant getCreatedAtGt();

    @Nullable Instant getCreatedAtLte();

    @Nullable Instant getCreatedAtLt();

    @Nullable Instant getCapturedAtGte();

    @Nullable Instant getCapturedAtGt();

    @Nullable Instant getCapturedAtLte();

    @Nullable Instant getCapturedAtLt();

    @Nullable String getPaymentMethod();

    @Nullable PaymentStatus getStatus();

    @Nullable Integer getLimit();

    @Nullable String getCursor();

    static GetPaymentsRequest create(
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
        return new GetPaymentsRequestImpl(
            createdAtGte,
            createdAtGt,
            createdAtLte,
            createdAtLt,
            capturedAtGte,
            capturedAtGt,
            capturedAtLte,
            capturedAtLt,
            paymentMethod,
            status,
            limit,
            cursor
        );
    }

    static GetPaymentsRequestImpl.GetPaymentsRequestImplBuilder builder() {
        return GetPaymentsRequestImpl.builder();
    }
}
