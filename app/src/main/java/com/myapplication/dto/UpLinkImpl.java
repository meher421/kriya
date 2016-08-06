package com.myapplication.dto;

import java.util.ArrayList;

/**
 * Created by meher on 26/7/16.
 */

public class UpLinkImpl implements UpLinkInterface {

    private UplinkData mInstance = UplinkData.getInstance();

    @Override
    public void createProduct(int id, String productName, ArrayList<Market> markets) {
        mInstance.createProduct(id, productName, markets);
    }

    @Override
    public void editProduct(int id, String productName, ArrayList<Market> market) {

        mInstance.editProduct(id,productName,market);

    }

    @Override
    public void deleteProduct(int id) {
        mInstance.deleteProduct(id);

    }

    @Override
    public void addMarket(int productId, Market market) {
        mInstance.addMarket(productId,market);
    }

    @Override
    public ArrayList<Product> getAllProducts() {

        return mInstance.getAllProducts();
    }

    @Override
    public Product getProduct(int id) {
        return mInstance.getProduct(id);
    }

    @Override
    public void addProduct(Product product) {
        mInstance.addProduct(product.getId(),product);
    }
}
