package com.mefrreex.yookassa.api.model;

import com.mefrreex.yookassa.impl.model.AmountImpl;
import com.mefrreex.yookassa.utils.gson.annotation.Implementation;

import java.math.BigDecimal;

@Implementation(AmountImpl.class)
public interface Amount {
    BigDecimal getValue();

    Currency getCurrency();

    static Amount of(BigDecimal value, Currency currency) {
        return new AmountImpl(value, currency);
    }
}
