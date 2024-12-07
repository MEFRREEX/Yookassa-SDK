package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.Payment;
import com.mefrreex.yookassa.api.model.payment.PaymentList;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PaymentListImpl implements PaymentList {
    private final String type;
    private final List<Payment> items;
    private final String nextCursor;

    public PaymentListImpl(String type, List<Payment> items, @Nullable String nextCursor) {
        this.type = type;
        this.items = items;
        this.nextCursor = nextCursor;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public List<Payment> getPayments() {
        return items;
    }

    @Override
    public @Nullable String getNextCursor() {
        return nextCursor;
    }
}
