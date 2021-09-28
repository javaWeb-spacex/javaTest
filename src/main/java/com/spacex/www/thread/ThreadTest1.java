package com.spacex.www.thread;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        });
        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        });
        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadC.start();
        threadC.join();
        System.out.println("main");





    }
}
