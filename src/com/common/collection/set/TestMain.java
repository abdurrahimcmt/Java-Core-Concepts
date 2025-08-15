package com.common.collection.set;

public class TestMain {
    public static void main(String[] args) {
        CourseManagementSystem c = new CourseManagementSystem();
        System.out.println("All Students: " + c.getAllStudents());
        System.out.println("Difference Students: " + c.getDifferenceStudents("math","physics"));
        System.out.println("Common Students: " + c.getCommonStudents("math","physics"));
        c.findStudentFromAllThreeCourses("Bob");
        System.out.println("All student sorted order : " + c.getAllStudentsSortedOrder());

    }
}
