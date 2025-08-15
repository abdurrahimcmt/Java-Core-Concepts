package com.common.solid.srp;

public class Srp {
    public void studentInfo(){
        System.out.println("Enrollment Successfully");
    }
    public void studentCourseEnrollment(){
        System.out.println("Student enroll in the course successfully");
    }
    public void studentAssignment(){
        System.out.println("Student assignment submitted");
    }
}
// This class doesn't follow SRP
////This class have many responsibility like
// To add a student must use this class
// To enroll in a course, a student must use this class.
// To submit assignment student must use this class
// To follow SRP we can create separate class for each function
class studentService{
    // code
}
class courseEnrollmentService{
    // code
}
class AssignmentService{
    // code
}