package com.common.collection.queue.BlockingQueue.SynchronousQueue;

import java.util.concurrent.SynchronousQueue;

public class TaskManager {

    SynchronousQueue<Runnable> synTask = new SynchronousQueue<>();
    Thread producer = new Thread(new Producer(synTask));
    Thread consumer = new Thread(new Consumer(synTask));
    public void startOperation(){
        producer.start();
        consumer.start();
    }
}
