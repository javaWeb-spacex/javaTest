package com.spacex.www.designPattern.singleton;

public class Test {
    public static void main(String[] args) {

        //普通形式的单例，饿汉式
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        //懒汉式，线程不安全

        Singleton1 singleton1=Singleton1.getInstance();
        singleton1.showMessage();

        //懒汉式，线程安全，方法上加锁
        Singleton2 singleton2=Singleton2.getInstance();
        singleton2.showMessage();

        //双检索/双重校验锁
        Singleton3 singleton3=Singleton3.getInstance();
        singleton3.showMessage();

        //登记式/静态内部类
        StaticnInner staticnInner=StaticnInner.getInstance();
        staticnInner.showMessage();

        //枚举
        EnumSingleton enumSingleton=EnumSingleton.INSTANCE;
        enumSingleton.showMessage();


    }
}
