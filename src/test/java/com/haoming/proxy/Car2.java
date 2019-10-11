package com.haoming.proxy;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class Car2 extends Car1 implements Vehicle{

    @Override
    public void move() {
        System.out.println("Cars run run run run run.");
        super.move();
        System.out.println("Airplane take off");
    }
}
