package com.common.collection.queue.BlockingQueue.SynchronousQueue;

import java.util.concurrent.SynchronousQueue;

public class Consumer implements Runnable{
    SynchronousQueue<Runnable> mainTask;

    public Consumer(SynchronousQueue<Runnable> mainTask) {
        this.mainTask = mainTask;
    }

    @Override
    public void run() {
        while (true){
            try {
                Runnable newTask = mainTask.take();
                System.out.println("Task Consumer consume task ....");
                newTask.run();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
