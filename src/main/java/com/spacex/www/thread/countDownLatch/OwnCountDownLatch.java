package com.spacex.www.thread.countDownLatch;

public class OwnCountDownLatch {
    private OwnCount ownCount;
    OwnCountDownLatch(Integer count){
        ownCount=new OwnCount(count);
    }
    public int getCount(){
        return ownCount.getCount();
    }

    //计数器减一
    public void cownDown(){
        int count=ownCount.getCount()-1;
        ownCount.setCount(count);
    }
    public void await(){
        this.getCount();
        if(this.getCount()<=0){
            for (Thread thread:this.ownCount.getThreads()) {
                //释放锁 列表中的线程全部执行
                thread.start();
            }

        }
    }



}
