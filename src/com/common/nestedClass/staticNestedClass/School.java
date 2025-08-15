package com.common.nestedClass.staticNestedClass;

public class School {
    final String schoolName = "Super school";
    String className;
    public String stringClassName;
    static double perStudentFee = 50;

    public School(String className) {
        this.className = className;
    }

    public void intro(){
        System.out.println("Welcome to "+ schoolName +" School");
    }

    public static class classTotalAmount {
        double totalStudent;
        public classTotalAmount(double totalStudent) {
            this.totalStudent = totalStudent;
        }
        public void totalFee(){
            System.out.println("Total Student fee: " + (perStudentFee * totalStudent));
        }
    }
}
