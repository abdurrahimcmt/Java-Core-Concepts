package com.common.collection.queue.BlockingQueue.SynchronousQueue;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Operation Start");
        TaskManager manager = new TaskManager();
        manager.startOperation();
    }
}
