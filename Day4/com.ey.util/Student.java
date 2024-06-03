package com.ey.util;
import java.util.Arrays;
import java.util.Date;

public class Student {
	private Integer admissionCode;
	private String studentName;
	private Date birthdate;
	private Integer [] marks; // array to hold marks in 3 subjects
	private String grade;
	private static Integer admissionCounter = 1;
	private static String schoolName;
	
	static {
        schoolName = "Hyderabad Public School";
    }

    public Student() {
        this.admissionCode = admissionCounter++;
    }
	
    public Student(String studentName, Date birthdate) {
        this(); // Invoke default constructor to generate admissionCode
        this.studentName = studentName;
        this.birthdate = birthdate;
    }
    
    public Student(String studentName, Date birthdate, Integer[] marks) {
        this(studentName, birthdate); // Invoke 2-arg constructor
        this.marks = marks;
        setGrade();
    }

	public Integer getAdmissionCode() {
		return admissionCode;
	}

	//public void setAdmissionCode(Integer admissionCode) {
		//this.admissionCode = admissionCode;
	//}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Integer[] getMarks() {
		return marks;
	}

	public void setMarks(Integer[] marks) {
		if(marks.length==3) {
		this.marks = marks;
		setGrade();
		}
		else
			throw new IllegalArgumentException("Marks Array must contain exactly 3 Elements");
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		int totalMarks = 0;
        for (Integer mark : marks) {
            totalMarks += mark;
        }
			if(totalMarks>=240)
				this.grade = "Excellent";
			else if(totalMarks>=180)  
				this.grade = "Goood";
			else if(totalMarks>=150)
				this.grade = "Average";
			else
				this.grade = "fail";
	}

	/*public static Integer getAdmissionCounter() {
		return admissionCounter;
	}

	public static void setAdmissionCounter(Integer admissionCounter) {
		Student.admissionCounter = admissionCounter;
	}*/

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
}

	