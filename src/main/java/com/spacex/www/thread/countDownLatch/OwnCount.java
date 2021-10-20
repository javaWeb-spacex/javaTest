package com.spacex.www.thread.countDownLatch;

import java.util.ArrayList;
import java.util.List;

public class OwnCount {
    private  Integer count;
    private List<Thread> threads;
    OwnCount(Integer count){
        this.count=count;
        threads=new ArrayList<Thread>();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }
}
