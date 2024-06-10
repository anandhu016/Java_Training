package com.ey.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.ey.q2.Search;

public class SourceDestination {
	public static void main(String[] args) throws IOException {
		FileInputStream f3=new FileInputStream("D:\\java assignments\\Results dat-7\\Source.txt");
		File f1=new File("D:\\java assignments\\Results dat-7");
		String[] li=f1.list();
		Scanner sc=new Scanner(System.in);
		
		
		FileOutputStream f2=null;
		String sname="Destination1.txt";
		String path="D:\\java assignments\\Results dat-7\\Destination1.txt";
		Search s=new Search();
		boolean flag = s.searchFile(li, sname);
		if(flag) {
			System.out.println("Enter the choicw no");
			System.out.println("1-TO OVER WRITE");
			System.out.println("2-NOT TO OVER WRITE");
			int a=sc.nextInt();
			if(a==1) {
				f2=new FileOutputStream(path);
				System.out.println("File Overwrited sucessfully");
			}
			else if (a==2) {
				f2=new FileOutputStream(path,true);
				System.out.println("File appended sucessfully");
			}
			else
				System.out.println("Enter the correct choice!!!");
			
		}
		else {
			f2=new FileOutputStream(path);
			System.out.println("File created sucessfully");
		}
		
		
		int k;
		while((k=f3.read())!=-1) {
			f2.write(k);
		}
		f3.close();
		f2.close();
	}
}
