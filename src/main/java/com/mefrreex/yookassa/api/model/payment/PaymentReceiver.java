package com.mefrreex.yookassa.api.model.payment;

import com.google.gson.annotations.SerializedName;
import com.mefrreex.yookassa.impl.model.payment.PaymentReceiverImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(PaymentReceiverImpl.class)
public interface PaymentReceiver {
    PaymentReceiverType getType();

    @Nullable String getAccountNumber();

    @Nullable String getBic();

    @Nullable String getPhone();

    enum PaymentReceiverType {
        @SerializedName("bank_account") BANK_ACCOUNT,
        @SerializedName("mobile_balance") MOBILE_BALANCE,
        @SerializedName("digital_wallet") DIGITAL_WALLET
    }

    static PaymentReceiver bankAccount(String accountNumber, String bic) {
        return new PaymentReceiverImpl(PaymentReceiverType.BANK_ACCOUNT, accountNumber, bic, null);
    }

    static PaymentReceiver mobileBalance(String phone) {
        return new PaymentReceiverImpl(PaymentReceiverType.MOBILE_BALANCE, null, null, phone);
    }

    static PaymentReceiver digitalWallet(String accountNumber) {
        return new PaymentReceiverImpl(PaymentReceiverType.DIGITAL_WALLET, accountNumber, null, null);
    }
}
