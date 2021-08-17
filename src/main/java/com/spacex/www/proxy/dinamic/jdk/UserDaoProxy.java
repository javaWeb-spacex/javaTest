package com.spacex.www.proxy.dinamic.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class UserDaoProxy implements InvocationHandler {

    private Object target;

    public UserDaoProxy(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务");
        Object result = method.invoke(target, args);
        System.out.println("提交事务");
        return result;
    }
}
