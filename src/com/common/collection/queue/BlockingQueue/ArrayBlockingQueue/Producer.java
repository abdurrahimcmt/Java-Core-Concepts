package com.common.collection.queue.BlockingQueue.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Number> numberProducer;

    public Producer(BlockingQueue<Number> numberProducer) {
        this.numberProducer = numberProducer;
    }

    @Override
    public void run() {
        while(true){
            try {
                Number number = Math.random() * 100;
                int intNum = number.intValue();
                System.out.println("Producer : " + intNum);
                numberProducer.put(intNum);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
