package com.common.multithreading.threadCommunication;

public class Consumer implements Runnable{
    SharedResourse sharedResourse;

    public Consumer(SharedResourse sharedResourse) {
        this.sharedResourse = sharedResourse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = sharedResourse.consume();
        }
    }
}
