package com.spacex.www.designPattern.singleton;

/**
 * 该模式不支持多线程，因为没有加锁synchronized,所以严格意义上它并不算单例。
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance==null){
            instance =new Singleton1();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("单例模式-懒汉式，不支持多线程。。。。。。。。。");
    }
}
