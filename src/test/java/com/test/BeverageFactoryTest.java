package com.test;

import com.test.service.BeverageFactoryService;
import com.test.service.BeverageFactoryServiceImpl;

public class BeverageFactoryTest {

    BeverageFactoryService beverageFactoryService;

    public void setUp() {
        beverageFactoryService = new BeverageFactoryServiceImpl();
    }

    public void testCoffee() {

        Double result = beverageFactoryService.order(null);


    }
}
