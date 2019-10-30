package com.yc.model.Strategy;

/**
 * @author cfun
 * @description 公交车
 * @date 2019-10-23
 */
public class BussCar extends Car {

    public BussCar(String name, String color) {
        super(name, color);
    }

    public void run() {
        System.out.println(color + "" + name + "在缓慢的行驶。。。");
    }
}
