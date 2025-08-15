package com.common.multithreading.threadCommunication;

public class TestMain {

    public static void main(String[] args) {
        SharedResourse sharedResourse = new SharedResourse();
        Thread producer = new Thread(new Produce(sharedResourse));
        Thread consumer = new Thread(new Consumer(sharedResourse));
        producer.start();
        consumer.start();
    }
}
