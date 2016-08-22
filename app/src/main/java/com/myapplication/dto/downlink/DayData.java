package com.myapplication.dto.downlink;

import com.myapplication.dto.Messages;
import com.myapplication.dto.Product;

import java.util.ArrayList;

/**
 * Created by meher on 21/8/16.
 */

public class DayData {

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    private double dollar;
    private long lastUpdated;

    private ArrayList<Messages> mMessages;
    private ArrayList<Product> mProducts;


    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<Messages> getmMessages() {
        return mMessages;
    }

    public void setmMessages(ArrayList<Messages> mMessages) {
        this.mMessages = mMessages;
    }

    public ArrayList<Product> getmProducts() {
        return mProducts;
    }

    public void setmProducts(ArrayList<Product> mProducts) {
        this.mProducts = mProducts;
    }
}
