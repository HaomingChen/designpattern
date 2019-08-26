package com.haoming;

/**
 * @author Haoming Chen
 * Created on 2019/8/26
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
