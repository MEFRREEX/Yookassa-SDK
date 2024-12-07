package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.GetPaymentsRequest;
import com.mefrreex.yookassa.api.model.payment.PaymentStatus;
import lombok.Builder;
import org.jetbrains.annotations.Nullable;

@Builder
public class GetPaymentsRequestImpl implements GetPaymentsRequest {
    private final PaymentStatus status;
    private final Integer limit;
    public final String cursor;

    public GetPaymentsRequestImpl(
        @Nullable PaymentStatus status,
        @Nullable Integer limit,
        @Nullable String cursor
    ) {
        this.status = status;
        this.limit = limit;
        this.cursor = cursor;
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
