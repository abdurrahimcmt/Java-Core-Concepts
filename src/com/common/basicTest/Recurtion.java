package com.common.basicTest;

public class Recurtion {
    public Recurtion() {
        //int sum = factorial(5);
        int sum = sumOfNumbers(100);
        System.out.println(sum);
    }
    public int factorial(int x){
        if(x == 1){
            return 1;
        }
        return x * factorial(x-1);
    }
    public int sumOfNumbers(int x){
        if(x == 1){
            return 0;
        }
        return x + sumOfNumbers(x-1);
    }
}
