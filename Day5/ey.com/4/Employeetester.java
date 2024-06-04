package com.ey.q4;

public class Employeetester {
	public static void main(String[] args) {
		Employeevalidator ev= new Employeevalidator();
		Employee e1=new Employee(1,"sai","vardhan");
		Employee e2=new Employee(2,"ram","vardhan");
		Employee e3=new Employee(3,"max","vardhan");
		Employee e4=new Employee(4,"raj","vardhan");
		Employee e5=new Employee(5,"mark","vardhan");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		
		ev.list();
		
		ev.fnamesort();
		
	}

}
