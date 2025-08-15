package com.common.collection.queue.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Producer implements Runnable{
    ConcurrentLinkedQueue<String> linkedQueue;

    public Producer(ConcurrentLinkedQueue<String> linkedQueue) {

        this.linkedQueue = linkedQueue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            linkedQueue.offer("Name" + i);
            System.out.println("Name" + i + " Task added");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
