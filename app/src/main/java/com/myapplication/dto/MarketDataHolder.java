package com.myapplication.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by meher on 28/8/16.
 */

public class MarketDataHolder {

    private Map<String, HashMap<String, Market>> mProducts;


    public Map<String, HashMap<String, Market>> getProducts() {
        return mProducts;
    }

    public void setProducts(Map<String, HashMap<String, Market>> mProducts) {
        this.mProducts = mProducts;
    }
}
