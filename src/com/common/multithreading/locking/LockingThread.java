package com.common.multithreading.locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingThread {
    private double balance = 500;
    Lock lock = new ReentrantLock(true);
    public void withdraw(double amount){
        try {
            //Incoming thread wait for 1000 second then the thread will unlock and waited thread start working
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    System.out.println("Current balance is " + balance);
                    System.out.println(Thread.currentThread().getName() + " Want to withdraw " + amount + " taka");
                    balance -= amount;
                    try {
                        //if thread sleep > 1000 then another thread will not run successfully
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " withdrawn " + amount + " taka new balance is : " + balance);
                    } catch (InterruptedException e) {
                        System.out.println("Process interrupted please try again later");
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName() + " Sorry!!! Insufficient balance.");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not running cause of locking by another thread");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName() + " is interacted ");
        }
    }
}
