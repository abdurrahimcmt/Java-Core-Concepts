package com.common.collection.queue;

public class Student implements Comparable<Student>{
    String studentName;
    int num ;

    public Student(String studentName,int num) {
        this.num = num;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }
}
