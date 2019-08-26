package com.haoming;

/**
 * @author Haoming Chen
 * Created on 2019/8/26
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
}
