package com.common.multithreading.starvation;

import java.util.concurrent.locks.ReentrantLock;

public class StarvationExp {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    reentrantLock.lock();
                    while (true){
                        System.out.println(Thread.currentThread().getName() + " is running........");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    reentrantLock.unlock();
                }
            }
        };
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");

        try {
            t1.start();
            t2.start();
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
