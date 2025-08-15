package com.common.multithreading.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    private int count = 0;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock writeLock = lock.writeLock();
    private final Lock readLock = lock.readLock();

    public void increment(){
        writeLock.lock();
        try {
            count++;
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " value increment " + count);
        }
        catch (Exception e){
            System.out.println("WriteLock Interrupted");
        }
        finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try{
           return count;
        }
        finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLock rwlock = new ReadWriteLock();
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++ ){
                    rwlock.increment();
                }
            }
        };

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++ ){
                    System.out.println(Thread.currentThread().getName() + " Read " + rwlock.getCount() );
                }
            }
        };
        Thread rdth1 = new Thread(readTask, "Read Thread 1");
        Thread wrth = new Thread(writeTask,"Write Thread 1");
        Thread rdth2 = new Thread(readTask, "Read Thread 2");

        wrth.start();
        rdth1.start();
        rdth2.start();

    }
}
