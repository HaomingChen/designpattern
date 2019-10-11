package com.haoming.proxy;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class Car1 implements Vehicle {
    @Override
    public void move() {
        System.out.println("I believe I can fly");
    }
}