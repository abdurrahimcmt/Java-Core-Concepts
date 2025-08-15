package com.common.multithreading.stateOfThread;

public class ThreadYeild extends Thread{

    public ThreadYeild(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " Count " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadYeild t1 = new ThreadYeild("t1");
        ThreadYeild t2 = new ThreadYeild("t2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
