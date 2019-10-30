package com.yc.model.Strategy;

/**
 * @author cfun
 * @description 运行环境类
 * @date 2019-10-23
 */
public class Strategy {
    public static void main(String[] args) {

        Car smallCar = new SmallCar("路虎", "黑色");
        Car bussCar = new BussCar("公交车", "白色");
        Person p1 = new Person("小明", 20);
        p1.driver(smallCar);
        p1.driver(bussCar);
    }
}
