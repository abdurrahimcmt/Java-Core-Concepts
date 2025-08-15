package com.common.multithreading.stateOfThread;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {

//        DaemonThread dt = new DaemonThread();
//        dt.setDaemon(true);
//        dt.start();

        MyThread mt = new MyThread();
        //mt.start();
        System.out.println("My Thread status: " + mt.getState());
        mt.start();
        System.out.println("My Thread status: " + mt.getState());
        Thread.sleep(100);
        System.out.println("My Thread status: " + mt.getState());
        mt.interrupt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mt.join();
        System.out.println("My Thread status: " + mt.getState());
        System.out.println("Main");
    }
}
