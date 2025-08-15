package com.common.multithreading.LambdaExpression;

public class TestMain {
    public static void main(String[] args) {
        //General User of Runnable interface
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("General User of Runnable interface");
            }
        };

        //Functional interface can be use by lambda expression
        Runnable runnable = () -> {
            System.out.println("Functional interface can be use by lambda expression");
        };

        Thread task1 = new Thread(runnable);
        Thread task2 = new Thread(r1);

        //Functional interface can be use directly into thread
        Thread task3 = new Thread(() -> System.out.println("Function interface runnable can be use directly into thread"));

        task1.start();
        task2.start();
        task3.start();

        // custom functional interface
        EmployeeName emp = () -> System.out.println("Hi I am a custom functional interface");
        emp.name();

    }
}
