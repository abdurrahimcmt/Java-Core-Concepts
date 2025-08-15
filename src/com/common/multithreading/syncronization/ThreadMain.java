package com.common.multithreading.syncronization;

public class ThreadMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread mt1 = new MyThread(counter);
        MyThread mt2 = new MyThread(counter);
        mt1.start();
        mt2.start();
        try {
            mt1.join();
            mt2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());

    }
}
