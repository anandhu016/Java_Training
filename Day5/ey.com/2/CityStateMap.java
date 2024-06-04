package com.ey.q2;

import java.util.*;

public class CityStateMap {
	public static void main(String[] args) {
		Map<String,String> cs=new HashMap<>();
		
		cs.put("Amaravathi","Andhra pradesh");
		cs.put("Hyderabad","Telangana");
		cs.put("Chennali","Tamilnadu");
		cs.put("Benguluru","Karantaka");
		cs.put("Mumbai","Maharastra");
		
		System.out.println("====Welcome to state_city_map====");
		System.out.println("Pleses select the option number:");
		System.out.println("To get all the cities type-1");
		System.out.println("To get all the states type-2");
		System.out.println("to get city for a state type-3");
		System.out.println("To add a new city state pair type-4");
		System.out.println("to delete all the cities in a state type-5");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1) {
			Set keys=cs.keySet();
			System.out.println(keys);
		}
		else if (a==2) {
			Collection values=cs.values();
			System.out.println(values);
		}
		else if(a==3) {
			System.out.println("enter the city name:");
			String s= sc.next();
			System.out.println(cs.get(s));
		}
		else if(a==4) {
			System.out.println("enter the city name:");
			String s1= sc.next();
			System.out.println("enter the State name:");
			String s2= sc.next();
			Set entries=cs.entrySet();
			System.out.println(entries);
		}
		else if(a==5) {
			System.out.println("enter the city name:");
			String s1= sc.next();
			cs.remove(s1);
			Set entries=cs.entrySet();
			System.out.println(entries);
		}
		
	}

}
