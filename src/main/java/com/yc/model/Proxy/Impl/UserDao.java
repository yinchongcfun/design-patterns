package com.yc.model.Proxy.Impl;

import com.yc.model.Proxy.IUserDao;

public class UserDao implements IUserDao {
    @Override
    public void save() {
      System.out.println("保存数据");
    }
}
