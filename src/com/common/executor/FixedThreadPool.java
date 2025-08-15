package com.common.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i <= 100; i++) {
                executorService.execute(new Task(i));
            }
            for (int i = 100; i <= 200; i++) {
                executorService.execute(new Task(i));
            }
            executorService.shutdown();
        }
    }
}



