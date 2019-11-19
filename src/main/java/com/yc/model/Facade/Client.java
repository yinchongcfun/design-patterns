package com.yc.model.Facade;

/**
 * @author cfun
 * @description 场景类
 * @date 2019-11-19
 */
public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String address="yxk";
        String contenxt="hello ,world!";
        modenPostOffice.sendLetter(contenxt,address);
    }
}
