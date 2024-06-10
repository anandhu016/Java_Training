package com.ey.day8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Callser {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		
		List<CallDetailRecord> c=new ArrayList<>();
		
		while(true) {
			System.out.println("Enter FROM number of contact:");
			int a1=sc.nextInt();
			System.out.println("Enter TO number of contact:");
			int a2=sc.nextInt();
			System.out.println("Enter Duration of contact:");
			float a3=sc.nextFloat();
			float a4=a3*1;
			c.add(new CallDetailRecord(a1, a2, a3, a4));
			System.err.println("Do tou want to add info Yes/no");
			System.out.println("Enter your choice:");
			String s=sc.next();
			if(s.equals("no"))
				System.out.println("ENDED");
				break;
			
		}
		FileOutputStream f1= new FileOutputStream("ChargeRecord.ser");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(c);
		System.out.println("Serialization Done!!!");
	}
	
	

}
