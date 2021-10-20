package com.spacex.www.thread.thread_pool;

public class ThreadPoolTest {
    public static void main(String[] args) {
        int num=21;
        for(int i=1;i<=21;i++){
            final int j=i;
            ThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"执行了任务"+ j);
                }
            });
        }
        ThreadPool.destory();
    }
}
