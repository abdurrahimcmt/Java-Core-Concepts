package com.common.collection.queue.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Consumer implements Runnable{
    ConcurrentLinkedQueue<String> linkedQueue;

    public Consumer(ConcurrentLinkedQueue<String> linkedQueue) {
        this.linkedQueue = linkedQueue;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Pooled task -> " + linkedQueue.poll());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
