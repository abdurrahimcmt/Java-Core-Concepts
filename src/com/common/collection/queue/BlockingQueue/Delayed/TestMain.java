package com.common.collection.queue.BlockingQueue.Delayed;

import java.util.concurrent.DelayQueue;

public class TestMain {
    public static void main(String[] args) {
        DelayQueue<Task> delayQueue = new DelayQueue<>();
        delayQueue.put(new Task("Task 1",15));
        delayQueue.put(new Task("Task 2",10));
        delayQueue.put(new Task("Task 3",20));

        while(!delayQueue.isEmpty()){
            try {
                Task task = delayQueue.take();
                task.executor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
