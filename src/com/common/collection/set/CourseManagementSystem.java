package com.common.collection.set;

import java.util.*;

public class CourseManagementSystem implements CourseManagerService{
    //Math:       Alice, Bob, Charlie, David
    //Physics:    Charlie, David, Eva, Frank
    //Chemistry:  Bob, George, Henry, Alice
    HashSet<String> mathStudents = new HashSet<>(Set.of("Alice", "Bob", "Charlie", "David"));
    HashSet<String> Physics = new HashSet<>(Set.of("Charlie", "David", "Eva", "Frank"));
    HashSet<String> chemistryStudents = new HashSet<>(Set.of("Bob", "George", "Henry", "Alice"));

    public Set<String> findCourseByName(String name){
        return switch (name) {
            case "math" -> mathStudents;
            case "physics" -> Physics;
            case "chemistry" -> chemistryStudents;
            default -> null;
        };
    }

    @Override
    public Set<String> getAllStudents() {
        HashSet<String> allStudents = new HashSet<>(mathStudents);
        allStudents.addAll(Physics);
        allStudents.addAll(chemistryStudents);
        return allStudents;
    }

    @Override
    public Set<String> getAllStudentsSortedOrder() {
        TreeSet<String> allStudents = new TreeSet<>(getAllStudents());
        return allStudents;
    }

    @Override
    public Set<String> getCommonStudents(String course1, String course2) {
        Set<String> c1 = findCourseByName(course1);
        Set<String> c2 = findCourseByName(course2);
        Set<String> commonStudent = new HashSet<>(c1);
        commonStudent.retainAll(c2);
        return commonStudent;
    }

    @Override
    public Set<String> getDifferenceStudents(String course1, String course2) {
        Set<String> c1 = findCourseByName(course1);
        Set<String> c2 = findCourseByName(course2);
        //all Students
        Set<String> allStudent = new HashSet<>(c1);
        allStudent.addAll(c2);
        //Find Common Students
        Set<String> differentStudent = new HashSet<>(c1);
        differentStudent.retainAll(c2);
        //Remove Common Students
        allStudent.removeAll(differentStudent);
        return allStudent;
    }

    @Override
    public void findStudentFromAllThreeCourses(String name) {
        Set<String> allStudents = getAllStudents();
        if(allStudents.contains(name)){
            System.out.println(name + " is enrolled");
        }
        else{
            System.out.println(name +  " Student not enrolled");
        }
    }

    @Override
    public boolean isSameStudent(String course1, String course2) {
        Set<String> c1 =  findCourseByName(course1);
        Set<String> c2 = findCourseByName(course2);
        return c1.containsAll(c2);
    }

}
