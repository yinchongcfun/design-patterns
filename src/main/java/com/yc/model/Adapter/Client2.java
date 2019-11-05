package com.yc.model.Adapter;

/**
 * @author cfun
 * @description 查看劳动服务公司人员信息
 * @date 2019-11-05
 */
public class Client2 {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
