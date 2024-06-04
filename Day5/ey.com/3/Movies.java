package com.ey.q3;

public class Movies {
	String name;
	String date;
	String director;
	String producer;
	Double duration;
	public Movies(String name, String date, String director, String producer, Double duration) {
		super();
		this.name = name;
		this.date = date;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", date=" + date + ", director=" + director + ", producer=" + producer
				+ ", duration=" + duration + "]";
	}
	
	
}
