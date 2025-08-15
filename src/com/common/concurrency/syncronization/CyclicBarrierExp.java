package com.common.concurrency.syncronization;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExp {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> System.out.println("Barrier stopped"));
        System.out.println("Barrier started");
        new MyThread(cyclicBarrier,"A");
        new MyThread(cyclicBarrier,"B");
        new MyThread(cyclicBarrier,"C");

    }
}
class MyThread{
    CyclicBarrier cyclicBarrier;
    String name;

    public MyThread(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        new Thread(runnable).start();
    }
    Runnable runnable = () -> {

        try {
            System.out.println(name + " Start");

            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    };
}
