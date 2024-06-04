package com.ey.q3;

import java.util.*;

public class Moviestester {
	public static void main(String[] args) {
		Moviesvaidator mv=new Moviesvaidator();
		
		Movies m1= new Movies("projectk","27-07","nag","aswini dutt",2.45);
		Movies m2= new Movies("salar","27-07","prashanth","dvv",2.45);
		Movies m3= new Movies("bheemla NAIK","27-07","sagar","Trivikram",2.30);
		Movies m4= new Movies("RRR","27-07","ss.Rajamouli","Raju",3.00);
		mv.addmovie(m1);
		mv.addmovie(m2);
		mv.addmovie(m3);
		mv.addmovie(m4);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1-create");
		System.out.println("2-sort by director");
		System.out.println("3-sort by producer");
		System.out.println("enter your choice");
		int a = sc.nextInt();
		
		if (a==1) {
			System.out.println("enter the movie name");
			String s1=sc.next();
			System.out.println("enter the movie date");
			String s2=sc.next();
			System.out.println("enter the movie director name");
			String s3=sc.next();
			System.out.println("enter the movie producer name");
			String s4=sc.next();
			System.out.println("enter the movie duration");
			Double d1=sc.nextDouble();
			Movies m= new Movies(s1,s2,s3,s4,d1);
			mv.addmovie(m);
			mv.list();
			
			
		}
		else if (a==2) {
			mv.directorsort();
			
		}
		else if (a==3) {
			mv.producersort();
			
		}
		
	}


}
