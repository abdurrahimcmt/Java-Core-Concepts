package com.common.multithreading.stateOfThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread is running");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupt by main thread");
        }
    }
}
