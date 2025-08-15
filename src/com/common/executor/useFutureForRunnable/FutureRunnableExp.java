package com.common.executor.useFutureForRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureRunnableExp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<?> future = ex.submit(task);
        System.out.println("Task Start");
        future.get();
        System.out.println("Task End");
        ex.shutdown();

    }
    static Runnable task = () -> {
        System.out.println(Thread.currentThread().getName() + " Running -----");
    };
}
