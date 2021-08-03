package com.spacex.www.designPattern.singleton;

public class StaticnInner {
    //静态内部类
    private static class Singleton4{
        private static final StaticnInner instance=new StaticnInner();
    }
    private StaticnInner(){

    }
    public  static  final StaticnInner getInstance(){
        return Singleton4.instance;
    }

    public void showMessage() {
        System.out.println("单例模式-静态内部类，支持多线程。。。。。。。。。");
    }

}
