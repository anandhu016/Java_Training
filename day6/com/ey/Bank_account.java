package com.ey;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class InvalidAmountException extends RuntimeException{
	InvalidAmountException(String msg){
		super(msg);
	}
}
class LowAmountException extends RuntimeException{
	LowAmountException(String msg){
		super(msg);
	}
}


class Bankdet{
	int accno;
	String custname;
	String acctype;
	float balance;
	public Bankdet(int accno, String custname, String acctype, float balance) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.acctype = acctype;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bankdet [accno=" + accno + ", custname=" + custname + ", acctype=" + acctype + ", balance=" + balance
				+ "]";
	}
	
}

public class Bank_account {
	
	static void deposit(float amt) {
		if(amt<0) {
			throw new InvalidAmountException("Do not enter the negitive numbers.");
		}
		else
			System.out.println("Deposit done");
		
	}
	
	static void withdraw(float amt) {
		if(amt<1000) {
			throw new InvalidAmountException("Insufficient funds!!! below 1000.");
		}
		else
			System.out.println("withdraw done");
		
	}
	static void withdraw1(float amt) {
		if(amt<5000) {
			throw new InvalidAmountException("Insufficient funds!!! below 5000.");
		}
		else
			System.out.println("withdraw done");
		
	}
	
	static float getbalance(float amt) {
		if(amt<1000) {
			throw new LowAmountException("LOw balence!!! below "+amt);
		}
		else
			return amt;
		
	}
	
	
	public static void main(String[] args) {
		
		Bankdet b1=new Bankdet(123, "sai", "savings", 100000f);
		
		List<Bankdet> l=new ArrayList<>();
		l.add(b1);
		
		deposit(10000f);
		float x=b1.balance-90000f;
		
		if(b1.acctype.matches("savings")) {
			withdraw(x);
			
		}
		if(b1.acctype.matches("current")){
			withdraw1(x);
		}
		System.out.println(getbalance(x));
		
		
	}

}
