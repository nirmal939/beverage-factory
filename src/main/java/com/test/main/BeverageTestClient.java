package com.test.main;

import com.test.service.BeverageFactoryService;
import com.test.service.BeverageFactoryServiceImpl;

public class BeverageTestClient {
    public static void main(String[] args) {
        BeverageFactoryService service = new BeverageFactoryServiceImpl();
        Double price = service.order("Chai, Coffee, -sugar, -milk, -water, -mint");

        System.out.println(price);
    }
}
