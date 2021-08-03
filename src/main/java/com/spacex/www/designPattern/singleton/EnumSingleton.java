package com.spacex.www.designPattern.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void showMessage(){
        System.out.println("单例模式-枚举，支持多线程。。。。。。。。。");
    }
}
