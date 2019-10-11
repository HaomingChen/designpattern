package com.haoming.factory;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class VehicleFactory {

    private String type;

    public Vehicle createVehicleFactory(String type) {
        if ("Bus".equalsIgnoreCase(type)) {
            return new Bus();
        }
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        }
        if ("Bicycle".equalsIgnoreCase(type)) {
            return new Bicycle();
        }
        return null;
    }

}
