package com.spacex.www.designPattern.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square重写了draw()方法");
    }
}
