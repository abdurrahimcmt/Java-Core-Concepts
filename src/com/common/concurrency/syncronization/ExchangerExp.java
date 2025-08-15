package com.common.concurrency.syncronization;

import java.util.concurrent.Exchanger;

public class ExchangerExp {
    public static Exchanger<String> exchanger = new Exchanger<>();
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            dataExchange("Thread 1","I love thread 2");
        });

        Thread t2 = new Thread(() ->{
            dataExchange("Thread 2", "I love Thread 1");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("Proposal excepted");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void dataExchange(String name, String massage){
        try {
            System.out.println(name + " : " + massage);
            String receivedDate = exchanger.exchange(massage);
            System.out.println(name + " Receive SMS: " + receivedDate);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
