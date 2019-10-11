package com.haoming.proxy;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class LogProxyForCar implements Vehicle {

    public LogProxyForCar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private Vehicle vehicle;

    @Override
    public void move() {
        System.out.println(vehicle.getClass().getSimpleName());
        vehicle.move();
    }

}
