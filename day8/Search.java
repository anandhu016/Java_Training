package com.ey.day8;

import java.io.File;
import java.util.Scanner;

public class Search {
	public boolean searchFile(String[] li,String fname) {
		boolean flag=false;
		try {
			for(int i=0;i<li.length;i++) {
				if(fname.equals(li[i]))
					flag=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	public static void main(String[] args){

		File f1=new File("D:\\java assignments\\Results dat-7");
		
		String[] li=f1.list(); // copy list of file into array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String fname=sc.next();
		Search s=new Search();
		boolean flag = s.searchFile(li, fname);
		if(flag)
			System.out.println("File "+fname+" found in the path");
		else
			System.out.println("File not found");
	}
}
