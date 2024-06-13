package com.ey.day13task;

public class Product {
	
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	
}
