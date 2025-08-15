package com.common.collection.queue.BlockingQueue.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestMain {
    public static void main(String[] args) {
        BlockingQueue<Number> number = new ArrayBlockingQueue<>(5);
        Thread producerThread = new Thread(new Producer(number));
        Thread consumerThread = new Thread(new Consumer(number));

        producerThread.start();
        consumerThread.start();
    }
}
