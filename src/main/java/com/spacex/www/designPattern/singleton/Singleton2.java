package com.spacex.www.designPattern.singleton;

/**
 * 该模式支持多线程，效率很低
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if(instance==null){
            instance =new Singleton2();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("单例模式-懒汉式，支持多线程。。。。。。。。。");
    }
}
