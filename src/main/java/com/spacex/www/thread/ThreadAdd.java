package com.spacex.www.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadAdd extends Thread{



        static int a = 0;

        @Override
        public void run() {
            synchronized (this) {
                for(int i=1;i<=10000;i++) {
                    a++;
                    System.out.println(a);
                }
            }
        }


        public static void main(String[] args) {
            long nowTimeMillis=System.currentTimeMillis();
            ThreadAdd threadAdd = new ThreadAdd();

            List<Thread> threads = new ArrayList<Thread>();
            for(int i=1;i<=10;i++) {
                threads.add(new Thread(threadAdd));
            }
            for(Thread thread :threads) {
                thread.start();
            }
            for(Thread thread :threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
