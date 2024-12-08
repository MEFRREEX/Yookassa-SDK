package com.mefrreex.yookassa.impl.model;

import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.Currency;

import java.math.BigDecimal;

public class AmountImpl implements Amount {

    private final BigDecimal value;
    private final Currency currency;

    public AmountImpl(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }
}
