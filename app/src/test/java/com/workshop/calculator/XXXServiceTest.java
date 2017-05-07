package com.workshop.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by phatpan on 5/7/2017 AD.
 */
public class XXXServiceTest {

    @Test
    public void doProcess(){
        StubService1 stubService1 = new StubService1();
        XXXService xxxService = new XXXService();
        xxxService.setService1(stubService1);
        xxxService.doProcess();
        assertTrue(stubService1.callInsert);
    }
}

class StubService1 implements Service1{

    public boolean callInsert = false;

    @Override
    public String getName() {
        return null;
    }

    public void insert() {
        callInsert = true;
    }
}