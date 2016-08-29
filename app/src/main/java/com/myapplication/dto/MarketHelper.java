package com.myapplication.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by meher on 28/8/16.
 */

public class MarketHelper implements IMarket {

    private static MarketHelper mInstance = new MarketHelper();
    private MarketDataHolder linkData = new MarketDataHolder();


    private MarketHelper() {
    }

    public static MarketHelper getInstance() {
        return mInstance;
    }


    @Override
    public Map<String, HashMap<String, Market>> getProducts() {
        return linkData.getProducts();
    }

    @Override
    public void setProducts(Map<String, HashMap<String, Market>> data) {
        linkData.setProducts(data);
    }
}
