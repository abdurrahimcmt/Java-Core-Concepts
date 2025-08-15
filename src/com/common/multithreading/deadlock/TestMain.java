package com.common.multithreading.deadlock;

public class TestMain {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();
        Task1 task1 = new Task1(pen, paper);
        Task2 task2 = new Task2(pen, paper);

        Thread t1 = new Thread(task1,"Task 1");
        Thread t2 = new Thread(task2, "Task 2");

        t1.start();
        t2.start();

    }
}
