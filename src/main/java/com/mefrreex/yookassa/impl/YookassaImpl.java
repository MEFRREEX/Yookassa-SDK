package com.mefrreex.yookassa.impl;

import com.mefrreex.yookassa.api.Yookassa;

public class YookassaImpl implements Yookassa {

    private final int shopIdentifier;
    private final String shopToken;

    public YookassaImpl(int shopIdentifier, String shopToken) {
        this.shopIdentifier = shopIdentifier;
        this.shopToken = shopToken;
    }

    @Override
    public int getShopIdentifier() {
        return shopIdentifier;
    }

    @Override
    public String getShopToken() {
        return shopToken;
    }
}
