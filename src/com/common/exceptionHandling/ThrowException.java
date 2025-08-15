package com.common.exceptionHandling;

public class ThrowException {
    public Student addStudent(int id,String name,int age,boolean isAdultForVote){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        try {
            student.setAdultForVote(isAdultForVote);
        } catch (InvalideAgeException e) {
            throw new RuntimeException(e.getMessage());
        }
        return student;
    }
}
