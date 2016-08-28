package com.myapplication.dto.testLink;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by meher on 28/8/16.
 */

public class TestLinkData {

    private Map<String, Object> mPrductsMap = new HashMap<>();
    private Map<String,HashMap<String,Market>> mProducts;


    public void setProductMap(Map<String, Object> data) {
        mPrductsMap = data;
    }

    public Map<String, Object> getProductsMap(){

        return mPrductsMap;

    }

    public Map<String, HashMap<String, Market>> getProducts() {
        return mProducts;
    }

    public void setProducts(Map<String, HashMap<String, Market>> mProducts) {
        this.mProducts = mProducts;
    }
}
