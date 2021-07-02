package com.spacex.www.thread_pool;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;


public class ThreadPool {

    private static Logger logger=LoggerFactory.getLogger(ThreadPool.class);
    private static ThreadPoolExecutor pool=null;

    static {
        pool=new ThreadPoolExecutor(1,10,3,
                TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10),
                new CustomThreadFactory(),new CustomRejectedExecutionHandler());
    }
    //线程销毁
    public static void destory(){
        pool.shutdown();
    }
    //线程运行
    public static void execute(Runnable r){
        pool.execute(r);
    }
    //线程工厂，实现线程的个性化定义
    private static class CustomThreadFactory implements ThreadFactory{
        private AtomicInteger count=new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            Thread thread=new Thread(r);
            String threadName=ThreadPool.class.getSimpleName()+count.incrementAndGet();
            thread.setName(threadName);
            return thread;
        }

    }

    //拒接策略
    private static class CustomRejectedExecutionHandler implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            logger.error("任务执行失败{}，线程池已满{}"+r.toString()+executor.toString());
        }
    }

}
