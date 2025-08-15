package com.common.concurrency.syncronization;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    int count;
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new IncrementCount("Shafiq",semaphore);
        new DecrementCount("Sharia",semaphore);
    }
}
class recourse{
    static int count;
}

class IncrementCount{
    String name;
    Semaphore sem;

    public IncrementCount(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(r1).start();
    }
    Runnable r1 = () -> {
        System.out.println(name +" is waiting for permit");
        try {
            sem.acquire();
            System.out.println(name +" get permit");
            for(int i = 0; i < 10 ; i++){
                recourse.count++;
                System.out.println(name + " Count " + recourse.count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name +" is released!");
        sem.release();

    };
}

class DecrementCount{
    String name;
    Semaphore sem;
    public DecrementCount(String name, Semaphore sem){
        this.name = name;
        this.sem = sem;
        new Thread(r2).start();
    }
    Runnable r2 = () -> {
        System.out.println(name + " is Waiting for permit");
        try {
            sem.acquire();
            System.out.println(name + " get permit");
            for(int i = 0; i < 10; i++ ){
                recourse.count--;
                System.out.println(name + " Count" + recourse.count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " is released");
        sem.release();
    };
}
