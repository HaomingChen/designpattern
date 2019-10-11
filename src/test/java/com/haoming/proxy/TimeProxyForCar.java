package com.haoming.proxy;

import java.util.Date;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class TimeProxyForCar implements Vehicle {

    public TimeProxyForCar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private Vehicle vehicle;

    @Override
    public void move() {
        System.out.println(new Date());
        vehicle.move();
    }
}
