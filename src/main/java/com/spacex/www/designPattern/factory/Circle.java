package com.spacex.www.designPattern.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle重写了draw()方法");
    }
}
