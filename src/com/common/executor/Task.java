package com.common.executor;

public class Task implements Runnable{
    int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread id - " + id);
    }
}
