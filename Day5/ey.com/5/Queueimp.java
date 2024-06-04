package com.ey.q5;

import java.util.*;

import com.ey.q4.Employee;

public class Queueimp {

	public static void main(String[] args) {
		Queue<Object> q= new LinkedList<>();
		q.add(1);
		q.add("sai");
		q.add(2.3);
		q.add(3.3f);
		q.add(true);
		q.add(Employee.class);
		System.err.println(q);
		
	}
	
}
