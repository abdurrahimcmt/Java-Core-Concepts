package com.common.multithreading.deadlock;

public class Pen {
    public synchronized void writeWithPanAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " use the pen " + this + " and trying to use " + paper);
        paper.finishedWriting();
    }
    public synchronized void finishedWriting(){
        System.out.println(Thread.currentThread().getName() + " finished writing with pen " + this);
    }
}
