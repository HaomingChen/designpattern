package com.haoming;

/**
 * @author Haoming Chen
 * Created on 2019/8/26
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
