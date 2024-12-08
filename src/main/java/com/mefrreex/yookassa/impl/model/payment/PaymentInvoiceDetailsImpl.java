package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.PaymentInvoiceDetails;

public class PaymentInvoiceDetailsImpl implements PaymentInvoiceDetails {

    private final String id;

    public PaymentInvoiceDetailsImpl(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
