package com.common.collection.queue.BlockingQueue.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Number> numberConsumer;

    public Consumer(BlockingQueue<Number> numberConsumer) {
        this.numberConsumer = numberConsumer;
    }

    @Override
    public void run() {
        while (true){
            try {
                Number num = numberConsumer.take();
                int intNum = num.intValue();
                if(intNum % 2 == 0){
                    System.out.println("Consume (Even) : " + intNum);
                }
                else{
                    System.out.println("Consume (Odd) : " + intNum);
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
