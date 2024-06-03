package com.ey.util;

import java.util.Date;

public class StudentTester {
    public static void main(String[] args) {
        
        Student student1 = new Student("Anandhu", new Date(), new Integer[]{85, 90, 95});
        Student student2 = new Student("Ram", new Date(), new Integer[]{90,87,80});
        Student student3 = new Student("Rahul", new Date(), new Integer[]{54,67,64});
        Student student4 = new Student("Jio", new Date(), new Integer[]{45, 50, 65});
        Student student5 = new Student("Mat", new Date(), new Integer[]{78,65,80});

        StudentValidator validator = new StudentValidator();
        boolean isValidStudent1 = validator.isValidStudent(student1);
        boolean isValidStudent2 = validator.isValidStudent(student2);
        boolean isValidStudent3 = validator.isValidStudent(student3);
        boolean isValidStudent4 = validator.isValidStudent(student4);
        boolean isValidStudent5 = validator.isValidStudent(student5);
        
        if (isValidStudent1 && isValidStudent2 && isValidStudent3 && isValidStudent4 && isValidStudent5) {
            Student[] students = {student1, student2, student3, student4, student5};
            StudentService studentService = new StudentService();
            studentService.showStudentDetails(students);
        } else 
            System.out.println("Some students are invalid. Please check their details.");
        
    }
}
