package com.myapplication.dto.downlink;

import com.myapplication.dto.Market;
import com.myapplication.dto.Messages;
import com.myapplication.dto.Product;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by meher on 23/8/16.
 */

public class DownLinkData {

    private static DownLinkData mInstance = new DownLinkData();
    private DayData mDayData;

    private DownLinkData() {
    }

    public static DownLinkData getInstance() {
        return mInstance;
    }

    public DayData getTodaysData() {
        return mDayData;
    }

    public void setTodaysData(DayData data) {
        mDayData = data;
    }

    public HashMap<String,ArrayList<Market>> getProducts() {
        return mDayData.getProducts();
    }

    public int getProductsSize() {
        return mDayData.getProducts().size();
    }

    public ArrayList<Messages> getMessages() {
        return mDayData.getMessages();
    }

    public int getMessagesSize() {
        return mDayData.getMessages().size();
    }


}
