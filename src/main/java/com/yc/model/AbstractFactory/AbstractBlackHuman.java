package com.yc.model.AbstractFactory;


/**
 * @author cfun
 * @description 黑色人种
 * @date 2019-10-30
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话听不懂");
    }
}
