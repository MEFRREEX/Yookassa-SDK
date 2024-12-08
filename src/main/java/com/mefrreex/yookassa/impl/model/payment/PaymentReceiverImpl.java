package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.PaymentReceiver;
import org.jetbrains.annotations.Nullable;

public class PaymentReceiverImpl implements PaymentReceiver {
    private final PaymentReceiverType type;
    private final String accountNumber;
    private final String bic;
    private final String phone;

    public PaymentReceiverImpl(PaymentReceiverType type, @Nullable String accountNumber, @Nullable String bic, @Nullable String phone) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.bic = bic;
        this.phone = phone;
    }

    @Override
    public PaymentReceiverType getType() {
        return type;
    }

    @Override
    public @Nullable String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public @Nullable String getBic() {
        return bic;
    }

    @Override
    public @Nullable String getPhone() {
        return phone;
    }
}
