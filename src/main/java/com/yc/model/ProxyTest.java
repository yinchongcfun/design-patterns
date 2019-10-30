package com.yc.model;

import com.yc.model.Proxy.ProxyFactory.CglibProxyFacory;
import com.yc.model.Proxy.IUserDao;
import com.yc.model.Proxy.Impl.UserDao;

public class ProxyTest {
    public static void main (String[] args){
//        静态代理
//        //目标对象

//        //目标对象
//        IUserDao target =new UserDao();
//        //代理对象
//        UserDaoProxy proxy = new UserDaoProxy(target);
//        //执行的是代理的方法
//        proxy.save();


        //动态代理
//        //目标对象
//        IUserDao target =new UserDao();
//        //代理对象
//        IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
//        //执行的是代理的方法
//        proxy.save();

        //目标对象
        //目标对象
        IUserDao target =new UserDao();
        //代理对象
        IUserDao proxy = (IUserDao)new CglibProxyFacory(target).getProxyInstance();
        //执行的是代理的方法
        proxy.save();
    }
}
