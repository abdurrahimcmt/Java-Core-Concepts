package com.common.collection.set;

import java.util.Set;

public interface CourseManagerService {
    Set<String> getAllStudents();
    Set<String> getAllStudentsSortedOrder();
    Set<String> getCommonStudents(String course1, String course2);
    Set<String> getDifferenceStudents(String course1, String course2);
    void findStudentFromAllThreeCourses(String name);
    boolean isSameStudent(String course1, String course2);

}
