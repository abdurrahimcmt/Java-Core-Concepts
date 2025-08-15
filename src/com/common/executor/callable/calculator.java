package com.common.executor.callable;

import java.util.concurrent.*;

public class calculator {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> sum = executorService.submit(new Sum(10));
        Future<Double> sqrt = executorService.submit(new Square(10.0));
        System.out.println("Sum : " + sum.get());
        System.out.println("Sqrt : " + sqrt.get());
        executorService.shutdown();
    }
}
class Square implements Callable<Double>{
    Double num;

    public Square(Double num) {
        this.num = num;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt(num);
    }
}

class Sum implements Callable<Integer> {

    int num;
    int sum = 0;
    public Sum(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }
}