package com.spacex.www.designPattern.responsibilityChain;

public class ConsoleLogger extends AbstractLogger{
    public  ConsoleLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console logger"+message);
    }
}
