package com.common.collection.list.copyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class Book {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> sharedList = new CopyOnWriteArrayList<>();

        Thread write = new Thread(() -> {
            String[] list = {"Korim","Rahim","Soaib","Motin","Nahin"};
            for(String s : list){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sharedList.add(s);
                System.out.println("Thread write : " + s);
            }
        });

        Thread read = new Thread(() -> {
            for(int i = 0; i <5 ; i++){
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread Read : " + sharedList);
        });

        write.start();
        read.start();

        try {
            write.join();
            read.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Book read and write done : " + sharedList);

    }
}
