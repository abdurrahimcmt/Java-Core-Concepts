package com.common.multithreading.threadCommunication;

public class SharedResourse {
    int data;
    boolean hasData;

    public synchronized void produce(int data){
        while(hasData) {
            try {
                wait();
            }
            catch (Exception ex){
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        System.out.println("Produce: " + data);
        hasData = true;
        notify();
    }
    public synchronized int consume(){
        while(!hasData){
            try {
                wait();
            }
            catch (Exception ex){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consume: " + data);
        notify();
        return data;
    }
}

