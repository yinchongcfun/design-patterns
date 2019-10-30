package com.yc.model.Builder;

/**
 * @author cfun
 * @description 导演类
 * @date 2019-10-30
 */
public class CLientDirector {
    public static void main(String[] args) {
        Director director = new Director();
        //1万辆A类型的奔驰车
        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
        }
        //100万辆B类型的奔驰车
        for (int i = 0; i < 10; i++) {
            director.getBBenzModel().run();
        }
        //1000万辆C类型的宝马车
        for (int i = 0; i < 10; i++) {
            director.getCBMWModel().run();
        }
    }
}
