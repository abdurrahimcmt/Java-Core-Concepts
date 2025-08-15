package com.common.collection.queue.BlockingQueue.PriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class TaskMain {
    public static void main(String[] args) {
        PriorityBlockingQueue<Task> taskQueue = new PriorityBlockingQueue<>();

        Thread procedure = new Thread(() -> {
            taskQueue.put(new Task("CertificateGenerate", 4));
            taskQueue.put(new Task("ScheduleStart", 2));
            taskQueue.put(new Task("CompleteSchedule", 3));
            taskQueue.put(new Task("StudentEnroll", 1));
            System.out.println("Task insert Successfully");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println("Task List : ");
                while (!taskQueue.isEmpty()){
                    Task task = taskQueue.take();
                    System.out.println(task.taskName +" -> Priority: " + task.priority);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        procedure.start();
        consumer.start();
    }
}
