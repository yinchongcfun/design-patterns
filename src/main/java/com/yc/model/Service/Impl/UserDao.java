package com.yc.model.Service.Impl;

import com.yc.model.Service.IUserDao;

public class UserDao implements IUserDao {
    @Override
    public void save() {
      System.out.println("保存数据");
    }
}
