package com.common.multithreading.syncronization;

public class Counter {
    private int count = 0;

    // public synchronized void increment () // we also can use synchronized like this way
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}
