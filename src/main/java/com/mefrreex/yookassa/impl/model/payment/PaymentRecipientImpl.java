package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.PaymentRecipient;
import org.jetbrains.annotations.Nullable;

public class PaymentRecipientImpl implements PaymentRecipient {

    private final String accountId;
    private final String gatewayId;

    public PaymentRecipientImpl(@Nullable String accountId, @Nullable String gatewayId) {
        this.accountId = accountId;
        this.gatewayId = gatewayId;
    }

    @Override
    public @Nullable String getAccountId() {
        return accountId;
    }

    @Override
    public @Nullable String getGatewayId() {
        return gatewayId;
    }
}
