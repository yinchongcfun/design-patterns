package com.yc.model.Strategy;


/**
 * @author cfun
 * @description 具体策略实现子类
 * @date 2019-10-23
 */
public class SmallCar extends Car {

    public SmallCar(String name, String color) {
        super(name, color);
    }

    public void run() {
        System.out.println(color + "" + name + "飞奔");
    }
}
