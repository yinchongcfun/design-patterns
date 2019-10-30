package com.yc.model.Strategy;

/**
 * @author cfun
 * @description 应用场景类
 * @date 2019-10-23
 */
public class Person {
    private String name;
    private Integer age;
    private Car car;

    public void driver(Car car) {
        System.out.print(name + "  " + age + " 岁 " + " 开着");
        car.run();
    }

    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }
}
