package ey.com;

import java.util.*;

public class Studentservice {
	
	Set<Student> plist=new HashSet<>();
	
	public String addProduct(Student s) {
		plist.add(s);
		return "Student added sucessfully";
		}
	public void  listStudents(){
		plist.forEach(x->System.out.println(x));
	}
	public boolean isvalidfn(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.firstname.equals(s2.firstname)){
			return true;
		}
		else
			return false;
	}
	public boolean isvalidln(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.lastname.equals(s2.lastname)){
			return true;
		}
		else
			return false;
	}
	public String isvalidStudent(Object o1, Object o2) {
		if(isvalidfn(o1, o2) && isvalidln(o1, o2))
			return "Its a match";
		else
			return "Not a match";
	}
	
}
