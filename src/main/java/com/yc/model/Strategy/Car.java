package com.yc.model.Strategy;

/**
 * @author cfun
 * @description car不同的属性和行为
 * @date 2019-10-23
 */
public class Car implements CarFunction {
    protected String name;
    protected String color;

    public Car(String name, String color) {
        this.name=name;
        this.color=color;
    }

    @Override
    public void run() {
     System.out.println(color+"----"+name);
    }
}
