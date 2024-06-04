package com.ey.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Empcomp implements Comparator<Employee>{
	@Override
	public int compare(Employee a, Employee b) {
		return a.fname.compareTo(b.fname);
	}
}

public class Employeevalidator {
		List<Employee> plist=new ArrayList<>();
		
		public String addemployee(Employee e) {
			plist.add(e);
			return "employee added sucessfully";
		}
		public void  list(){
			plist.forEach(x->System.out.println(x));
		}
		public void fnamesort() {
			Collections.sort(plist, new Empcomp());
			list();
		}
		

}
