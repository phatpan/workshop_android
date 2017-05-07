package com.workshop.calculator;

/**
 * Created by phatpan on 5/7/2017 AD.
 */

public class XXXService {
    private Service1 service1;

    public XXXService(Service1 service1) {
        this.service1 = service1;
    }

    public XXXService() {

    }

    public void doProcess() {
        service1.getName();
        service1.insert();
    }

    public void setService1(Service1 service1) {
        this.service1 = service1;
    }
}

interface Service1 {
    String getName();
    void insert();
}