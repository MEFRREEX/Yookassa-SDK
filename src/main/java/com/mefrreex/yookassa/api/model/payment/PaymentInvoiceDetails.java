package com.mefrreex.yookassa.api.model.payment;

import com.mefrreex.yookassa.impl.model.payment.PaymentInvoiceDetailsImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;

@Implementation(PaymentInvoiceDetailsImpl.class)
public interface PaymentInvoiceDetails {
    String getId();

    static PaymentInvoiceDetails of(String id) {
        return new PaymentInvoiceDetailsImpl(id);
    }
}
