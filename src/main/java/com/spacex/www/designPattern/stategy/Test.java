package com.spacex.www.designPattern.stategy;

public class Test {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("20+7="+context.executeStrategy(20,7));

        Context context2=new Context(new OperationSubtract());
        System.out.println("20-7="+context2.executeStrategy(20,7));

        Context context3=new Context(new OperationMultipy());
        System.out.println("20*7="+context3.executeStrategy(20,7));

    }
}
