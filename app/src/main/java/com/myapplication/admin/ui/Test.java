package com.myapplication.admin.ui;

import com.myapplication.dto.Market;
import com.myapplication.dto.Messages;
import com.myapplication.dto.Product;
import com.myapplication.dto.UpLinkImpl;
import com.myapplication.dto.UpLinkInterface;

import java.util.ArrayList;

/**
 * Created by meher on 6/8/16.
 */

public class Test {

    public static void createTestData() {
        UpLinkInterface upLinkInterface = new UpLinkImpl();

        ArrayList<Market> markets1 = new ArrayList<>();
        markets1.add(new Market(1, "Nizmabad",1000, 89, 1));
        markets1.add(new Market(2, "Bodhan",600, 23, 2));
        markets1.add(new Market(3, "Armoor",300, 67, 3));
        markets1.add(new Market(4, "Hyderabad",500, 45, 4));
        Product product1 = new Product(1, "Turmaric", markets1);

        upLinkInterface.addProduct(product1);


        ArrayList<Market> markets2 = new ArrayList<>();
        markets2.add(new Market(1, "Nizmabad",1000, 89, 1));
        markets2.add(new Market(2, "Bodhan",600, 23, 2));
        markets2.add(new Market(3, "Armoor",300, 67, 3));
        markets2.add(new Market(4, "Hyderabad",500, 45, 4));
        Product product2 = new Product(2, "Cashew", markets2);

        upLinkInterface.addProduct(product2);

        ArrayList<Market> markets3 = new ArrayList<>();
        markets3.add(new Market(1, "Nizmabad",1000, 89, 1));
        markets3.add(new Market(2, "Bodhan",600, 23, 2));
        markets3.add(new Market(3, "Armoor",300, 67, 3));
        markets3.add(new Market(4, "Hyderabad",500, 45, 4));
        Product product3 = new Product(3, "Badam", markets3);

        upLinkInterface.addProduct(product3);

        ArrayList<Market> markets4 = new ArrayList<>();
        markets4.add(new Market(1, "Nizmabad",1000, 89, 1));
        markets4.add(new Market(2, "Bodhan",600, 23, 2));
        markets4.add(new Market(3, "Armoor",300, 67, 3));
        markets4.add(new Market(4, "Hyderabad",500, 45, 4));
        Product product4 = new Product(4, "Sesseme", markets4);

        upLinkInterface.addProduct(product4);

        Messages messages1 = new Messages();
        messages1.setMessage("sample message 1");
        messages1.setLastUpdate(System.currentTimeMillis());
        messages1.setTitle("title 1");

        upLinkInterface.addMessage(messages1);

        Messages messages2 = new Messages();
        messages2.setMessage("sample message 2");
        messages2.setLastUpdate(System.currentTimeMillis());
        messages2.setTitle("title 2");

        upLinkInterface.addMessage(messages2);

        Messages messages3 = new Messages();
        messages3.setMessage("sample message 3");
        messages3.setLastUpdate(System.currentTimeMillis());
        messages3.setTitle("title 3");

        upLinkInterface.addMessage(messages3);

        upLinkInterface.setDollarValue(67.45);


    }
}
