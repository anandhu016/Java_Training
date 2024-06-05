package com.ey;

import java.util.Stack;

class Contactclass{
	String fname;
	String mname;
	String lname;
	String gendre;
	int number;
	public Contactclass(String fname, String mname, String lname, String gendre, int number) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gendre = gendre;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contactclass [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", gendre=" + gendre
				+ ", number=" + number + "]";
	}
	
}


public class StackOpp {
	
	public static void main(String[] args) {
		Contactclass c1=new Contactclass("sai", "vardhan", "kadambala", "male", 123456);
		
		Stack<Contactclass> s=new Stack<>();
		s.push(c1);
		System.out.println(s);
		//s.pop();
		try {
			s.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Contactclass c2=new Contactclass("sai1", "vardhan1", "kadambala1", "male", 123456);
		
		try {
			s.push(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			s.push(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}

}
