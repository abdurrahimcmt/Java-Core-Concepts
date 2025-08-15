package com.common.collection.queue.BlockingQueue.PriorityBlockingQueue;

public class Task implements Comparable<Task> {
    String taskName;
    Integer priority;

    public Task(String taskName, Integer priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    @Override
    public int compareTo(Task o) {
        return this.priority.compareTo(o.priority);
    }
}


