package com.haoming.proxy;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class Car3 implements Vehicle {

    public Car3(Vehicle car) {
        vehicle = car;
    }

    private Vehicle vehicle;

    @Override
    public void move() {
        System.out.println("I dont believe this");
        vehicle.move();
        System.out.println("The sun rise");
    }
}
