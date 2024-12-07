package com.mefrreex.yookassa.api.model.payment;

import com.mefrreex.yookassa.impl.model.payment.PaymentListImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Implementation(PaymentListImpl.class)
public interface PaymentList {
    String getType();

    List<Payment> getPayments();

    @Nullable String getNextCursor();

    static PaymentList create(String type, List<Payment> items, @Nullable String nextCursor) {
        return new PaymentListImpl(type, items, nextCursor);
    }
}
