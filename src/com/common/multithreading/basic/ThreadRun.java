package com.common.multithreading.basic;

public class ThreadRun extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Running thread is: " + Thread.currentThread().getName());
        }
    }
}
