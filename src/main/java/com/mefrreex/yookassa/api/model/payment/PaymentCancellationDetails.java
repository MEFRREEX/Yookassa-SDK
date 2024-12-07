package com.mefrreex.yookassa.api.model.payment;

import com.mefrreex.yookassa.impl.model.payment.PaymentCancellationDetailsImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;

@Implementation(PaymentCancellationDetailsImpl.class)
public interface PaymentCancellationDetails {
    String getParty();

    String getReason();

    static PaymentCancellationDetails of(String party, String reason) {
        return new PaymentCancellationDetailsImpl(party, reason);
    }
}
