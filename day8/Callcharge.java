package com.ey.day8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


public class Callcharge {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		FileInputStream f2=new FileInputStream("ChargeRecord.ser");
		ObjectInputStream o2=new ObjectInputStream(f2);
		
		@SuppressWarnings("unchecked")
		List<CallDetailRecord> c1 = (List<CallDetailRecord>) o2.readObject();
		
		for (CallDetailRecord record : c1) {
            System.out.println("From Number: " + record.getFnumber());
            System.out.println("To Number: " + record.getTnumber());
            System.out.println("Charge: " + record.getCharge());
            System.out.println("------------------------");
        }
		
	}
}
