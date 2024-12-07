package com.mefrreex.yookassa.api.model.payment;

import com.mefrreex.yookassa.impl.model.payment.PaymentRecipientImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(PaymentRecipientImpl.class)
public interface PaymentRecipient {
    @Nullable String getAccountId();

    @Nullable String getGatewayId();

    static PaymentRecipient of(@Nullable String accountId, @Nullable String gatewayId) {
        return new PaymentRecipientImpl(accountId, gatewayId);
    }
}
