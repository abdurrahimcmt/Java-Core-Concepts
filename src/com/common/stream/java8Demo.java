package com.common.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class java8Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mia");
        list.add("Alex");
        list.add("Anna");
        list.add("lisa");



        //Lambda expiration
        Calculator cal = (x,y) -> x * y;
        System.out.println(cal.sum(5,6 ));

        //Predicate
        Predicate<Integer> test = x -> x % 2 ==0;
        System.out.println(test.test(6));

        Runnable rn = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(list);
        };
        Thread th = new Thread(rn);

        th.start();

        //Predicate
        Predicate<String> startWith = s -> s.toUpperCase().startsWith("A");
        Predicate<String> endsWith = s -> s.toUpperCase().endsWith("M");
        Predicate<String> startEnd = startWith.and(endsWith);
        System.out.println("Is condition true -> "+ startEnd.test( "Abdur malek"));

        //Function
        Function<Integer,Integer> fn = n -> n * 2;
        Function<Integer,Integer> fn1 = n -> n * 5;

        System.out.println(fn1.andThen(fn).apply(100));
        System.out.println(fn1.compose(fn).apply(100));

        //consumer
        Consumer<Integer> consum = x -> {
           Integer y = x / 5;
            System.out.println(y);
        };
        Consumer<String> consum2 = System.out::println;

        consum.accept(50);
        consum2.accept("Abdur Rahim");

        //Combine exam
        Predicate<Integer> isOdd = x -> x % 2 == 0;
        Function<Integer,Integer> fun = x -> x * 5;
        Consumer<Integer> print = System.out::println;
        Supplier<Integer> num =  () -> 100;

        if(isOdd.test(num.get())){
            print.accept(fun.apply(num.get()));
        }

       // BiConsumer,BiPredicate,BiFunction

        BiConsumer<Integer,Integer> bicon = (x , y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiPredicate<Integer,Integer> biPred = (x , y) -> x % y == 0;

        BiFunction<String, String, Integer> bifun = (x , y ) -> (x + y).length();
        bicon.accept(50 , 55);
        System.out.println(biPred.test(122, 2));
        System.out.println(bifun.apply("Abdur ", "Rahim"));

        // UnaryOperator,BinaryOperator

        UnaryOperator<Integer> unary = x -> x + 10;
        BinaryOperator<String> binary = (x, y) -> (x+y).toUpperCase();

        System.out.println( unary.apply(5));
        System.out.println(binary.apply("Rahim ","Abdur"));

        //Method Reference
        List<String> nameList = Arrays.asList("Max","Mia","Alex","David");
        nameList.forEach(System.out::println);

        
    }
}
