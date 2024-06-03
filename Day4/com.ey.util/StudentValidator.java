package com.ey.util;
import java.util.Calendar;
public class StudentValidator {
	
    public boolean isValidStudentName(Student student) {
        String studentName = student.getStudentName();
        return studentName.matches("[a-zA-Z ]+");
    }
    
//    public boolean isValidStudentBirthdate(Student student) {
//        
//    }

    public boolean isValidStudentMarks(Integer[] integers) {
        for (int mark : integers) {
            if (mark < 0 || mark > 100) {
                return false;
            }
        }
        return true;
    }

    
    public boolean isValidStudent(Student student) {
        return isValidStudentName(student) &&
               /*isValidStudentBirthdate(student) &&*/
               isValidStudentMarks(student.getMarks());
    }
}
































/*//Check if student's birthdate is at least 5 years before the current date
public boolean isValidStudentBirthdate(Student student) {
    Calendar currentDate = Calendar.getInstance();
    Calendar birthdate = Calendar.getInstance();
    birthdate.setTime(student.getBirthdate());

    // Add 5 years to birthdate
    birthdate.add(Calendar.YEAR, 5);

    return birthdate.before(currentDate);
}*/
