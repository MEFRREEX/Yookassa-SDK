package com.mefrreex.yookassa.api.model.payment;

import com.mefrreex.yookassa.impl.model.payment.PaymentAuthorizationDetailsImpl;
import com.mefrreex.yookassa.impl.model.payment.PaymentAuthorizationDetailsImpl.ThreeDSecureImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;
import org.jetbrains.annotations.Nullable;

@Implementation(PaymentAuthorizationDetailsImpl.class)
public interface PaymentAuthorizationDetails {
    @Nullable String getRrn();

    @Nullable String getAuthCode();

    ThreeDSecure getThreeDSecure();

    @Implementation(ThreeDSecureImpl.class)
    interface ThreeDSecure {
        boolean isApplied();

        static ThreeDSecure of(boolean applied) {
            return new ThreeDSecureImpl(applied);
        }
    }

    static PaymentAuthorizationDetails of(@Nullable String rrn, @Nullable String authCode, ThreeDSecure threeDSecure) {
        return new PaymentAuthorizationDetailsImpl(rrn, authCode, threeDSecure);
    }
}
