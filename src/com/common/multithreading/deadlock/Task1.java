package com.common.multithreading.deadlock;

public class Task1 implements Runnable{
    Pen pen = new Pen();
    Paper paper = new Paper();

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPanAndPaper(paper);
    }
}
