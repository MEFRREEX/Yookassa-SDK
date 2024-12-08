package com.mefrreex.yookassa.api;

import com.mefrreex.yookassa.api.model.payment.CreatePaymentRequest;
import com.mefrreex.yookassa.api.model.payment.GetPaymentsRequest;
import com.mefrreex.yookassa.api.model.payment.Payment;
import com.mefrreex.yookassa.api.model.payment.PaymentList;
import com.mefrreex.yookassa.impl.YookassaImpl;

import java.util.UUID;

public interface Yookassa {

    int getShopIdentifier();

    String getShopToken();

    Payment createPayment(CreatePaymentRequest request);

    Payment getPayment(UUID id);

    PaymentList getPayments(GetPaymentsRequest request);

    static Yookassa create(int shopIdentifier, String shopToken) {
        return new YookassaImpl(shopIdentifier, shopToken);
    }
}
