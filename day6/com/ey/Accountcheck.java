package com.ey;

import java.util.*;
class AccountErrorException extends RuntimeException{
	AccountErrorException(String msg){
		super(msg);
	}
}

public class Accountcheck {
	
	boolean isvalidaccount(Set keys,int a) {
		if(keys.contains(a))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Map<Integer, String> m =new HashMap<Integer, String>();
		m.put(101, "sai");
		m.put(102, "max");
		m.put(103, "ram");
		m.put(104, "raj");
		m.put(105, "mark");
		Set keys=m.keySet();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the acc number");
		int acc=sc.nextInt();
		Accountcheck ac=new Accountcheck();
		boolean b=ac.isvalidaccount(keys,acc);
		if(b) {
			System.out.println(m.get(acc));
		}
		else
			throw new AccountErrorException("There is no user with this account");

		
		
	}
	

}
