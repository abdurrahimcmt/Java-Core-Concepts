package com.common.collection.queue.BlockingQueue.Delayed;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Task implements Delayed {
    String taskName;
    long startTime;

    public Task(String taskName, long DelayInSecond) {
        this.taskName = taskName;
        //convert second from milli second
        this.startTime = System.currentTimeMillis() + DelayInSecond * 1000;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis();
        return unit.convert(delay,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {

        if(this.startTime < ((Task) o).startTime ){
            return -1;
        }
        if(this.startTime > ((Task) o).startTime){
            return 1;
        }
        return 0;
    }

    public void executor(){
        System.out.println("The " + taskName + " execute at" + System.currentTimeMillis());
    }
}
