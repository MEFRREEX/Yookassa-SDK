package com.mefrreex.yookassa.api;

import com.mefrreex.yookassa.impl.YookassaImpl;

public interface Yookassa {

    int getShopIdentifier();

    String getShopToken();

    static Yookassa create(int shopIdentifier, String shopToken) {
        return new YookassaImpl(shopIdentifier, shopToken);
    }
}
