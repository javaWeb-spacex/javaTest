package com.spacex.www.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownlatchDemo1 implements Runnable {
    private static final CountDownLatch countDownLatch =  new CountDownLatch(5);
    static final CountdownlatchDemo1 countdownlatchDemo1 =new CountdownlatchDemo1();
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i =0;i<5;i++){
           executorService.execute(countdownlatchDemo1);
        }
        //等待检查
        countDownLatch.await();
        System.out.println(countDownLatch.getCount());

        System.out.println("OK");

        //关闭线程池
        executorService.shutdown();



    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("开启");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            countDownLatch.countDown();
            System.out.println("计数器还有："+countDownLatch.getCount());
        }



    }
}
