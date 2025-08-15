package com.common.multithreading.basic;

public class TestMain {
    public static void main(String[] args) {
        ThreadRun run = new ThreadRun();
        run.start();

        ThreadRunnable runneble = new ThreadRunnable();
        Thread tr = new Thread(runneble);
        tr.start();

        for(int i = 0; i < 10000; i++){
            System.out.println("Running thread is: " + Thread.currentThread().getName());
        }
    }
}
