package com.spacex.www.designPattern.singleton;

public class StaticnInner {
    private static class Singleton4{
        private static final StaticnInner instance=new StaticnInner();
    }
    private StaticnInner(){

    }
    public  static  final StaticnInner getInstance(){
        return Singleton4.instance;
    }

}
