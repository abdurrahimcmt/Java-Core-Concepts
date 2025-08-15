package com.common.generic.genericClass;

public class TestMain {
    public static void main(String[] args) {
        // We can specify the type of a class when it is defined.
        Box<String> box = new Box<>("Abdur Rahim");
        System.out.println(box.getValue());
        Box<Integer> box1 = new Box<>(768);
        System.out.println(box1.getValue());

        //We can use multiple type in a class
        Pair<String,Integer> student = new Pair<>("Abdur Rahim", 30);
        System.out.println("Name: " + student.getKey() + " Age: " + student.getValue());

    }
}
