package com.yc.model.Proxy.ProxyFactory;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
Cglib代理工厂
对userDao在内存中动态构建一个子类对象
 */
public class CglibProxyFacory implements MethodInterceptor {
    //维护目标对象
    private Object target;

    public CglibProxyFacory(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance() {
//        1.工具类
        Enhancer en = new Enhancer();
//        2. 设置父类
        en.setSuperclass(target.getClass());
//        3. 设置回调函数
        en.setCallback(this);
//        4. 创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务3");
        Object returevalue = method.invoke(target,objects);
        System.out.println("提交事务3");
        return returevalue;
    }
}
