package com.yc.model.Proxy.ProxyFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
创建动态代理对象
动态代理不需要实现,但是要指定接口类型
 */
public class ProxyFactory {
    private  Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getProxyInstance(){
      return Proxy.newProxyInstance(target.getClass().getClassLoader(),
              target.getClass().getInterfaces(),
              new InvocationHandler() {
                  @Override
                  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                      System.out.println("开始事务2");
                      //运用反射执行目标对象方法
                      Object returnValue = method.invoke(target, args);
                      System.out.println("提交事务2");
                      return returnValue;
                  }
              });
    }
}
