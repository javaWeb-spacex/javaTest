package com.spacex.www.spring.aop.proxy.dinamic.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserDaoProxy implements MethodInterceptor {
    private Object target;

    public UserDaoProxy(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        Enhancer en=new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("提交事务");
        return result;
    }
}