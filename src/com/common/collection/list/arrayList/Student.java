package com.common.collection.list.arrayList;

public class Student {
    private String studentName;
    private boolean isPresent;

    public Student(String studentName, boolean isPresent){
        this.studentName = studentName;
        this.isPresent = isPresent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
