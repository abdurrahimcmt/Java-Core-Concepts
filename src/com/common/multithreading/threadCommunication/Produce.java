package com.common.multithreading.threadCommunication;

public class Produce implements Runnable{
    SharedResourse sharedResourse;

    public Produce(SharedResourse sharedResourse) {
        this.sharedResourse = sharedResourse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResourse.produce(i);
        }
    }
}
