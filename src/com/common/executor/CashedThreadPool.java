package com.common.executor;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CashedThreadPool {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 100; i++) {
                executorService.execute(new Task(i));
            }
            for (int i = 100; i < 200; i++) {
                executorService.execute(new Task(i));
            }
            executorService.shutdown();
        }

    }
}
