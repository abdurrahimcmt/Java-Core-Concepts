package com.common.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Abdur Rahim", true));
        studentList.add(new Student("Kamal", false));
        studentList.add(new Student("Ripon", true));
        studentList.add(new Student("Moulik", false));
        studentList.add(new Student("Sadia", false));


        //set
       // studentList.set(2, new Student("Korim", true));
        //Remove
       // studentList.remove(3);
        //
        //retrieve
        System.out.println("Attendance list : ");
        attendanceListPrint(studentList);


        //copy list
        List<Student> studentList2 = new ArrayList<>();
        studentList2.addAll(studentList);
        System.out.println("Copy Attendance list : ");
        attendanceListPrint(studentList2);

        //Check Attendance
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to check attendance for a student? Type (y/n) ");
        String checkAttends = scanner.nextLine();
        if(checkAttends.equalsIgnoreCase("y")){
            System.out.println("Please insert student name");
            String studentName = scanner.nextLine();
            if(isValidStudent(studentList,studentName)){
                checkAttendance(studentList,studentName);
            }
        }
        //Print total present and absent student count
        totalCount(studentList);
        //update attendance
        System.out.println("If you want to update attendance? Type (y/n)");
        String wantUpdate = scanner.nextLine();
        if(wantUpdate.equalsIgnoreCase("y")){
            System.out.println("Please insert you student name : ");
            String updateStudentName = scanner.nextLine();
            System.out.println("Please insert you student status present or not type (y/n)");
            String studentStatus = scanner.nextLine();
            if(isValidStudent(studentList,updateStudentName)){
                updateAttendance(studentList,updateStudentName,studentStatus);
            }
            System.out.println("Updated Attendance list : ");
            attendanceListPrint(studentList);
        }
    scanner.close();
    }
    public static void attendanceListPrint(List<Student> studentList){
        for(Student student : studentList){
            System.out.println("Student Name : " + student.getStudentName() + " Attendance : " + (student.isPresent() ? "Yes" : "No") );
        }
    }

    public static boolean isValidStudent(List<Student> studentList,String studentName){
        for (Student student : studentList) {
            if ((student.getStudentName()).equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        System.out.println("Your selected student not valid");
        return false;
    }
    public static Student findStudent(List<Student> studentList,String studentName){
        for(Student st : studentList){
            if(st.getStudentName().equalsIgnoreCase(studentName)){
                return st;
            }
        }
        return null;
    }
    public static void updateAttendance(List<Student> studentList,String studentName,String studentStatus){
        Student st = findStudent(studentList,studentName);
        if(st != null){
            if(studentStatus.equalsIgnoreCase("y")){
                studentList.set(studentList.indexOf(st),new Student(studentName,true));
            }
            else{
                studentList.set(studentList.indexOf(st),new Student(studentName,false));
            }
            System.out.println("✅ Attendance updated for " + studentName);
        }
    }
    public static void totalCount(List<Student> studentList){
        int presentCount = 0;
        int absentCount = 0;
        for(Student st: studentList){
            if(st.isPresent()){
                presentCount ++;
            }
            else{
                absentCount ++;
            }
        }
        System.out.println("\n📊 Attendance Summary:");
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent : " + absentCount);
    }
    //
    public static void checkAttendance(List<Student> studentList, String name) {
        for (Student student : studentList) {
            if (student.getStudentName().equalsIgnoreCase(name)) {
                System.out.println("Your selected student (" +name+") is " + (student.isPresent() ? "Present" : "Absent") );
                break;
            }
        }
    }
}