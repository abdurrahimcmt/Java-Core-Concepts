package com.common.multithreading.locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLock {
    Lock lock = new ReentrantLock(true);
    private void addRecourse(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Start working" );
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Interrupted" );
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " Unlock Now" );
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLock fnl = new FairnessLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                fnl.addRecourse();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        try {
            t1.start();
            Thread.sleep(50);
            t2.start();
            Thread.sleep(50);
            t3.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
