package com.spacex.www.designPattern.template.hook;


public abstract class AbstractClass {

    public abstract boolean isOpen();

    public final void operating() {
        if(isOpen()) {
            System.out.println("钩子方法开启");
        }else {
            System.out.println("钩子方法关闭");
        }
    }
}
