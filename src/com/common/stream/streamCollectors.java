package com.common.stream;

import java.util.*;
import java.util.stream.Collectors;

public class streamCollectors {
    public static void main(String[] args) {
        //1 convert to list
        List<String> names = Arrays.asList("max","Mia","lisa");
        List<String> collect = names.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);
        //2 convert to set // remove duplicate value
        List<Integer> number = Arrays.asList(5,6,8,4,3,6,7,44,5);
        Set<Integer> collect1 = number.stream().collect(Collectors.toSet());
        System.out.println(collect1);

        //3 convert to collection
        LinkedList<String> collect2 = names.stream().collect(Collectors.toCollection(LinkedList::new));

        //4 joining (Concatenation string elements into a single string)
        String collect3 = names.stream().map(String::toUpperCase).collect(Collectors.joining(" *"));
        System.out.println(collect3);

        //Summaries data
        IntSummaryStatistics numSet = number.stream().distinct().collect(Collectors.summarizingInt(x -> x));
        System.out.println("min -> " + numSet.getMin());
        System.out.println("max -> " + numSet.getMax());
        System.out.println("average -> " + numSet.getAverage());
        System.out.println("Count -> " + numSet.getCount());
        System.out.println("Sum -> " + numSet.getSum());
        
        // sum
        Double collect4 = number.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Hello" + collect4);
        // Grouping elements
        List<String> st = Arrays.asList("Lisa","Mia","Anna","Alex","David","Jon","Tamme");
        Map<Integer, List<String>> stg1 = st.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, String> stg2 = st.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", ")));
        TreeMap<Integer, Long> stg3 = st.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(stg1);
        System.out.println(stg2);
        System.out.println(stg3);
        //Partitioning
        Map<Boolean, List<String>> stg4 = st.stream().collect(Collectors.partitioningBy(x -> x.startsWith("A")));
        Map<Boolean, Map<Integer, List<String>>> stg5 = st.stream().collect(Collectors.partitioningBy(x -> x.startsWith("A"),Collectors.groupingBy(String::length)));
        System.out.println(stg5);
        System.out.println(stg4);

    }
}
