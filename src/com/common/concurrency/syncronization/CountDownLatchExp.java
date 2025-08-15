package com.common.concurrency.syncronization;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExp {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        for(int i = 1; i <= 3; i++){
            new Thread(() -> {
                System.out.println(Thread.currentThread().threadId() + " Task done");
                latch.countDown();
            }).start();
        }
        try {
           // latch.await(); //CountDownLatch Waiting for all thread are terminated.
           boolean await = latch.await(1000, TimeUnit.MILLISECONDS); // Latch waits for a certain period of time. Then code execution will be proceeded
            // If all thread terminated then its return true otherwise false
           if(await){
               System.out.println("All Task is done");
           }
           else{
               System.out.println("Some of the Task is not worked");
           }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
