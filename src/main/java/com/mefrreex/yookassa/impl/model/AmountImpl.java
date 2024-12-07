package com.mefrreex.yookassa.impl.model;

import com.mefrreex.yookassa.api.model.Amount;

import java.math.BigDecimal;

public class AmountImpl implements Amount {

    private final BigDecimal value;
    private final String currency;

    public AmountImpl(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String getCurrency() {
        return currency;
    }
}
