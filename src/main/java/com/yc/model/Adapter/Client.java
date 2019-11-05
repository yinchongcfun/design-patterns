package com.yc.model.Adapter;

/**
 * @author cfun
 * @description 场景类
 * @date 2019-11-05
 */
public class Client {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
