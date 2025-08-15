package com.common.collection.comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        return this.name.compareTo(st.name);
    }

    @Override
    public String toString() {
        return  "Name : " + name + " Age : " + age;
    }
}
