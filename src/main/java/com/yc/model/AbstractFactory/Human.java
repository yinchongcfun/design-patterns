package com.yc.model.AbstractFactory;


/**
 * @desc:人类总称
 * 每个人种都至少具有两个方法，黑色人种、黄色人种、白 色人种的
 * @author:cfun
 * @date:2019-10-30
 **/
public interface Human {
    public void getColor();

    public void talk();

    public void getSex();
}
