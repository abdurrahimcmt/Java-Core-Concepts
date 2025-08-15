package com.common.multithreading.deadlock;

public class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() +" use the paper " + this + " trying to use pen" + pen);
        pen.finishedWriting();
    }
    public synchronized void finishedWriting(){
        System.out.println(Thread.currentThread().getName() + " finished writing with Paper" + this);
    }
}
