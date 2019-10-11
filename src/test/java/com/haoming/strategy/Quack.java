package com.haoming.strategy;

/**
 * @author Haoming Chen
 * Created on 2019/8/26
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Quack");
    }
}
