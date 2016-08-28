package com.myapplication.dto.testLink;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by meher on 28/8/16.
 */

public class TestLinkImpl implements ITest {

    private static TestLinkImpl mInstance = new TestLinkImpl();
    private TestLinkData linkData = new TestLinkData();


    private TestLinkImpl() {
    }

    public static TestLinkImpl getInstance() {
        return mInstance;
    }


    @Override
    public void setProductMap(Map<String, Object> data) {
        linkData.setProductMap(data);
    }

    public Map<String, Object> getProductsMap() {
        return linkData.getProductsMap();

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
