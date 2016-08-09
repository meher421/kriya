package com.myapplication.dto;

import java.util.ArrayList;

/**
 * Created by meher on 26/7/16.
 */

public interface UpLinkInterface {

    String getDate();

    double getDollarValue();

    void setDollarValue(double value);

    long getUpdatedTime();

    void addMessage(Messages message);

    ArrayList<Messages> getMessages();

    public void createProduct(int id, String productName, ArrayList<Market> markets);

    public void editProduct(int id, String productName, ArrayList<Market> market);

    public void deleteProduct(int id);

    public void addMarket(int productId, Market market);

    public ArrayList<Product> getAllProducts();

    public Product getProduct(int id);

    void addProduct(Product product);
}
