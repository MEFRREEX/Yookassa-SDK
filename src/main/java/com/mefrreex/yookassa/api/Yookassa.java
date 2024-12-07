package com.mefrreex.yookassa.api;

import com.mefrreex.yookassa.api.model.payment.CreatePaymentRequest;
import com.mefrreex.yookassa.api.model.payment.Payment;
import com.mefrreex.yookassa.impl.YookassaImpl;

public interface Yookassa {

    int getShopIdentifier();

    String getShopToken();

    Payment createPayment(CreatePaymentRequest request);

    static Yookassa create(int shopIdentifier, String shopToken) {
        return new YookassaImpl(shopIdentifier, shopToken);
    }
}
