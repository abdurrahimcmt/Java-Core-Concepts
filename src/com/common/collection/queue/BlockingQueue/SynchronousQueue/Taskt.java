package com.common.collection.queue.BlockingQueue.SynchronousQueue;

public class Taskt implements Runnable{
    Integer taskId;

    public Taskt(Integer taskName) {
        this.taskId = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is start working");
    }
}
