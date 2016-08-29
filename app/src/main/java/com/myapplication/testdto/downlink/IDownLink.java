package com.myapplication.testdto.downlink;

import com.myapplication.testdto.Market;
import com.myapplication.testdto.Messages;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by meher on 21/8/16.
 */

public interface IDownLink {


    void setTodaysData(DayData data);

    DayData getTodaysData();

    HashMap<String,ArrayList<Market>> getProducts();

    int getProductsSize();

    ArrayList<Messages> getMessages();

    int getMessagesSize();

    
}
