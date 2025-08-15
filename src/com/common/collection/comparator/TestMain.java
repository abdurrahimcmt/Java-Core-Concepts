package com.common.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class TestMain {
    public static void main(String[] args) {
        LinkedList<Student> studentsList = new LinkedList<>();
        studentsList.add(new Student("Rahim", 30 ));
        studentsList.add(new Student("Motin", 45));
        studentsList.add(new Student("Rahim", 20 ));
        studentsList.add(new Student("Sohag", 65));
        studentsList.add(new Student("Khalak", 25));
        studentsList.add(new Student("Khalak", 22));
        studentsList.add(new Student("yousuf",31));
        studentsList.add(new Student("khaled", 20 ));

        System.out.println("Student List before sort : ");
        for (Student st : studentsList){
            System.out.println("-> " + st);
        }

        Collections.sort(studentsList);
        System.out.println("Student List after sort (Comparable) : ");
        for (Student st : studentsList){
            System.out.println("-> " + st);
        }

        studentsList.sort(Comparator.comparing(Student::getName));
        System.out.println("Student List after sort (Comparator.comparing with Name) : ");
        for (Student st : studentsList){
            System.out.println("-> " + st);
        }

        studentsList.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
        System.out.println("Student List after sort : (Comparing name then Age)");
        for (Student st : studentsList){
            System.out.println("-> " + st);
        }


        studentsList.sort(Comparator.comparingInt(Student::getAge).reversed());
        System.out.println("Student List after sort : (Age Reverse order) ");
        for (Student st : studentsList){
            System.out.println("-> " + st);
        }

    }
}
