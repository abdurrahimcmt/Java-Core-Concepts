package com.common.multithreading.stateOfThread;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("I cant stop!!!!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

//    public static void main(String[] args) {
//        DaemonThread dt = new DaemonThread();
//        dt.setDaemon(true);
//        dt.start();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Stopped main thread");
//    }
}
