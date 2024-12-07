package com.mefrreex.yookassa.impl.model.payment;

import com.mefrreex.yookassa.api.model.payment.PaymentAuthorizationDetails;
import org.jetbrains.annotations.Nullable;

public class PaymentAuthorizationDetailsImpl implements PaymentAuthorizationDetails {

    private final String rrn;
    private final String authCode;
    private final ThreeDSecure threeDSecure;

    public PaymentAuthorizationDetailsImpl(@Nullable String rrn, @Nullable String authCode, ThreeDSecure threeDSecure) {
        this.rrn = rrn;
        this.authCode = authCode;
        this.threeDSecure = threeDSecure;
    }

    @Override
    public @Nullable String getRrn() {
        return rrn;
    }

    @Override
    public @Nullable String getAuthCode() {
        return authCode;
    }

    @Override
    public ThreeDSecure getThreeDSecure() {
        return threeDSecure;
    }

    public static class ThreeDSecureImpl implements ThreeDSecure {

        private final boolean applied;

        public ThreeDSecureImpl(boolean applied) {
            this.applied = applied;
        }

        @Override
        public boolean isApplied() {
            return applied;
        }
    }
}
