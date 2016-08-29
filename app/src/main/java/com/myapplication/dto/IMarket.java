package com.myapplication.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by meher on 28/8/16.
 */

public interface IMarket {

    void setProducts(Map<String, HashMap<String,Market>> data);

    Map<String, HashMap<String,Market>> getProducts();


}
