package com.myapplication.dto.testLink;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by meher on 28/8/16.
 */

public interface ITest {
    void setProductMap(Map<String, Object> data);

    Map<String, Object> getProductsMap();

    void setProducts(Map<String, HashMap<String,Market>> data);

    Map<String, HashMap<String,Market>> getProducts();


}
