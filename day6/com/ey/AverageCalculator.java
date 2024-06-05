package com.ey;

class IllegalArgumentException extends RuntimeException{
	IllegalArgumentException(String msg){
		super(msg);
	}
}

public class AverageCalculator{
	public Double calAverage(int n) {
		if(n>=1) {
			Double sum=0.0;
			for(int i=0;i<=n;i++) {
				sum=sum+i;
			}
			Double x=sum/n;
			return x;
		}
		else
			throw new IllegalArgumentException("Enter the natural number");
	}
	
	public static void main(String[] args) throws IllegalArgumentException {
		AverageCalculator ac=new AverageCalculator();
		Double s= ac.calAverage(-5);
		System.out.println(s);
		System.out.println("Thanks");
	}
	
}
