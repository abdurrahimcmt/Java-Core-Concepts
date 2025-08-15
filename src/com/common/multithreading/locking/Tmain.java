package com.common.multithreading.locking;

public class Tmain {
    public static void main(String[] args) {
        LockingThread wd = new LockingThread();
        Runnable action = new Runnable() {
            @Override
            public void run() {
                wd.withdraw(200);
            }
        };

        Thread t1 = new Thread(action, "Process 1");
        Thread t2 = new Thread(action, "Process 2");
        Thread t3 = new Thread(action, "Process 3");
        t1.start();

        t2.start();

        t3.start();

    }
}
