package com.spacex.www.designPattern.singleton;

/**
 * 该模式支持多线程，安全在多线程情况下能保持高性能
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public static  Singleton3 getInstance(){
        if(instance==null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("单例模式-懒汉式，支持多线程。。。。。。。。。");
    }
}
