package com.haoming.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Haoming Chen
 * Created on 2019/10/11
 */
public class ProxyHandler implements InvocationHandler {

    public ProxyHandler(Object target) {
        super();
        this.target = target;
    }

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        method.invoke(target);
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶.... 汽车行驶时间: " + (endtime - starttime) + "毫秒！");
        return null;
    }

}
