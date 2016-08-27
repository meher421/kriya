package com.myapplication.dto.downlink;

import com.myapplication.dto.Market;
import com.myapplication.dto.Messages;
import com.myapplication.dto.Product;

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
