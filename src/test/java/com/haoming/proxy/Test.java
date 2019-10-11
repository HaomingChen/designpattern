package com.haoming.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class Test {

    public static void main(String[] args) {
//        Car2 car2 = new Car2();
//        car2.move();
//        System.out.println("----------------");
//        Car1 car1 = new Car1();
//        Car3 car3 = new Car3(car1);
//        car3.move();
//        Car3 car3 = new Car3(new Car1());
//        TimeProxyForCar timeProxyForCar = new TimeProxyForCar(car3);
//        LogProxyForCar logProxyForCar = new LogProxyForCar(timeProxyForCar);
//        logProxyForCar.move();
        Car1 car1 = new Car1();
        ProxyHandler proxyHandler = new ProxyHandler(car1);
        Class<?> cls = car1.getClass();
        Vehicle vehicle = (Vehicle) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), proxyHandler);
        vehicle.move();
    }

}
