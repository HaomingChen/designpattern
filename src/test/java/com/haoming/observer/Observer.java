package com.haoming.observer;

/**
 * @author Haoming Chen
 * Created on 2019/9/23
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
