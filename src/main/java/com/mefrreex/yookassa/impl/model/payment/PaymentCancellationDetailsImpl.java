package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.PaymentCancellationDetails;

public class PaymentCancellationDetailsImpl implements PaymentCancellationDetails {

    private final String parity;
    private final String reason;

    public PaymentCancellationDetailsImpl(String parity, String reason) {
        this.parity = parity;
        this.reason = reason;
    }

    @Override
    public String getParty() {
        return parity;
    }

    @Override
    public String getReason() {
        return reason;
    }
}
