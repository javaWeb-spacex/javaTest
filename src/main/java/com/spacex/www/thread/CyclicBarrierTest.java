package com.spacex.www.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {


    static CyclicBarrier barrier1 = new CyclicBarrier(2);
    static CyclicBarrier barrier2 = new CyclicBarrier(2);

    public static void main(String[] args) {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("A:执行");
                    //放开栅栏1
                    barrier1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //放开栅栏1
                    barrier1.await();
                    System.out.println("B:执行");
                    //放开栅栏2
                    barrier2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //放开栅栏2
                    barrier2.await();
                    System.out.println("C:执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("C.start");
        thread3.start();
        System.out.println("A.start");
        thread1.start();
        System.out.println("B.start");
        thread2.start();

    }

}
