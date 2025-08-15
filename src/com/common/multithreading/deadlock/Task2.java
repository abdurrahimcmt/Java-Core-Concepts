package com.common.multithreading.deadlock;

public class Task2 implements Runnable{
    Pen pen = new Pen();
    Paper paper = new Paper();

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writeWithPaperAndPen(pen);
        }
    }
}
