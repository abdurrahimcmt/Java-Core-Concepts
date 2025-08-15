package com.common.collection.queue.BlockingQueue.SynchronousQueue;

import java.util.concurrent.SynchronousQueue;

public class Producer implements Runnable{
    SynchronousQueue<Runnable> mainTask;

    public Producer(SynchronousQueue<Runnable> mainTask) {
        this.mainTask = mainTask;
    }

    @Override
    public void run() {
        int taskId = 1;

        while (taskId < 5){
            Runnable task = new Taskt(taskId);
            try {
                System.out.println(taskId + " is Submitted");
                mainTask.put(task);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            taskId++;
        }
    }
}
