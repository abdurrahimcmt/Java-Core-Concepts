package com.common.exceptionHandling;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean isAdultForVote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAdultForVote() {
        return isAdultForVote;
    }

    public void setAdultForVote(boolean adultForVote) throws InvalideAgeException {
        if(adultForVote){
            if(age < 18){
                throw new InvalideAgeException("Student Age is not sufficient for Register");
            }
            else{
                isAdultForVote = true;
            }
        }
        isAdultForVote = adultForVote;
    }

    @Override
    public String toString(){
        return "Student id: " + id + " Name: " + name + " Age: " + age + " Adult: " + isAdultForVote;
    }
}
