package com.spacex.www.designPattern.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle重写了draw()方法");
    }
}
