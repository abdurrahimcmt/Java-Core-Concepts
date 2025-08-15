package com.common.collection.queue.BlockingQueue.PriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class priorityBlockingQueueExm {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        Thread producer = new Thread(() -> {
            pbq.put(50);
            pbq.put(30);
            pbq.put(80);

            System.out.println("Producer add 3 product");

        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(100);
                while (!pbq.isEmpty()){
                    System.out.println("Consume : " + pbq.take());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
       // System.out.println(pbq);//30,50,80
    }
}
