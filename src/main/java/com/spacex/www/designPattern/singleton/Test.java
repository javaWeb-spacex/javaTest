package com.spacex.www.designPattern.singleton;

public class Test {
    public static void main(String[] args) {
        //普通形式的单例
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        //懒汉式，线程不安全
        Singleton1 singleton1=Singleton1.getInstance();
        singleton1.showMessage();
        //懒汉式，线程安全，方法上加锁
        Singleton2 singleton2=Singleton2.getInstance();
        singleton2.showMessage();


    }
}
