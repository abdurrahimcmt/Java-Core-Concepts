package com.common.stream;

import java.util.List;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(10000).toList();
        List<Integer> factorialList = list.stream().map(parallelStream::factorial).toList();
        Long ends = System.currentTimeMillis();
        System.out.println("Taken Time: " + (ends - start));

        start = System.currentTimeMillis();
        List<Integer> factorialList2 = list.parallelStream().map(parallelStream::factorial).toList();
        ends = System.currentTimeMillis();
        System.out.println("Taken Time: " + (ends - start));
    }
    
    public static int factorial(int n){
        int fact = 1;
        for(int i =2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}
