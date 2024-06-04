package com.ey.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
class Directorcomp implements Comparator<Movies>{
	@Override
	public int compare(Movies a, Movies b) {
		return a.director.compareTo(b.director);
	}
}
class Producercomp implements Comparator<Movies>{
	@Override
	public int compare(Movies a, Movies b) {
		return a.producer.compareTo(b.producer);
	}
}
public class Moviesvaidator {
	List<Movies> plist=new ArrayList<>();
	
	public String addmovie(Movies m) {
		plist.add(m);
		return "Movie added sucessfully";
	}
	public void  list(){
		plist.forEach(x->System.out.println(x));
	}
	public void directorsort() {
		Collections.sort(plist, new Directorcomp());
		list();
	}
	public void producersort() {
		Collections.sort(plist, new Producercomp());
		list();
	}
}
