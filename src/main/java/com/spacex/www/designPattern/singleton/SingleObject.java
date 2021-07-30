package com.spacex.www.designPattern.singleton;

public class SingleObject {
    //创建SingleObject 的一个对象
    private static  SingleObject instance=new SingleObject();
    //私有构造方法
    private SingleObject(){

    }
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("普通单例模式。。。。。。。。。");
    }

}
