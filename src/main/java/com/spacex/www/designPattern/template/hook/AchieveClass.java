package com.spacex.www.designPattern.template.hook;

public class AchieveClass extends AbstractClass {

    //钩子方法能挂在到operating能干预到operating业务逻辑
    @Override
    public boolean isOpen() {
        return true;
    }

    public static void main(String[] args) {
        AchieveClass ac = new AchieveClass();
        ac.operating();
    }

}