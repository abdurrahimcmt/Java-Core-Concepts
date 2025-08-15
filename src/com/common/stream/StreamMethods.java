package com.common.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Max");
        names.add("Mia");
        names.add("Anna");

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

        Stream<String> namesStreamParallel = names.parallelStream();
        namesStreamParallel.forEach(System.out::println);

        Stream<String> st = Stream.of("A","B","C","D","E");
        st.forEach(x -> System.out.println(x.toLowerCase()));

        //Set
        Set<String> setOfName = new HashSet<>();
        setOfName.add("Korim");
        setOfName.add("Rahim");
        setOfName.add("Monir");
        setOfName.add("Sojol");

        List<String> sStream = setOfName.stream().filter(s -> s.startsWith("R")).toList();
        sStream.forEach(System.out::println);

        List<Integer> list = Stream.of(1, 9, 4, 6, 3, 10).map(x -> x + x).toList();
        List<Integer> list1 = list.stream().map(x -> x += x).toList();

        //sum
        List<Integer> num = new ArrayList<>(List.of(1, 9, 4, 6, 3, 10));

        Integer i = num.stream().reduce(Integer::sum).get();
        System.out.println(i);

        List<List<String>> students = Arrays.asList(
                Arrays.asList("Abdur","korim"),
                Arrays.asList("Max","Mia"),
                Arrays.asList("Alex","Lisa"),
                Arrays.asList("David","Anna")
        );

        List<String> list2 = students.stream().flatMap(Collection::stream)
                .filter(x -> x.startsWith("A")).toList();
        System.out.println(list2);
    }
}
