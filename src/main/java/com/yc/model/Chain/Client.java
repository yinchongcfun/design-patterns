package com.yc.model.Chain;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author cfun
 * @description
 * @date 2019-11-04
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我也出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        } //获得自己的状况

    }
}
