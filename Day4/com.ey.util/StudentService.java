package com.ey.util;

import java.util.Arrays;

public class StudentService {
    
    public void showStudentDetails(Student[] students) {
        for (Student student : students) {
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Admission Code: " + student.getAdmissionCode());
            System.out.println("Birthdate: " + student.getBirthdate());
            System.out.println("Marks: " + Arrays.toString(student.getMarks()));
            System.out.println("Grade: " + student.getGrade());
            System.out.println("School Name: " + Student.getSchoolName());
            System.out.println();
        }
    }
}
