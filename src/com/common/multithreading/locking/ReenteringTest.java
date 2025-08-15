package com.common.multithreading.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenteringTest {
    Lock lock = new ReentrantLock();

    public  void outerLock(){
        lock.lock();
        try {
            System.out.println("outer lock");
            innerLock();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
    public void innerLock(){
        lock.lock();
        try {
            System.out.println("inner lock");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReenteringTest rt = new ReenteringTest();
        rt.outerLock();
    }
}
