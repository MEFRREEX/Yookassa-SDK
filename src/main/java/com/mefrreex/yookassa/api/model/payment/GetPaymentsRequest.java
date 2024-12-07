package com.mefrreex.yookassa.api.model.payment;


import com.mefrreex.yookassa.impl.model.payment.GetPaymentsRequestImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(GetPaymentsRequestImpl.class)
public interface GetPaymentsRequest {
    @Nullable PaymentStatus getStatus();

    @Nullable Integer getLimit();

    @Nullable String getCursor();

    static GetPaymentsRequest create(
        @Nullable PaymentStatus status,
        @Nullable Integer limit,
        @Nullable String cursor
    ) {
        return new GetPaymentsRequestImpl(status, limit, cursor);
    }

    static GetPaymentsRequestImpl.GetPaymentsRequestImplBuilder builder() {
        return GetPaymentsRequestImpl.builder();
    }
}
