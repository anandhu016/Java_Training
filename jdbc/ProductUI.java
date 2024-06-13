package com.ey.day13task;

import java.util.List;

public class ProductUI {

	public static void main(String[] args) throws Exception{
		ProductService ps=new ProductService();
		Product p=new Product(1,"box");
		Product p1=new Product(2,"printer");
		Product p2=new Product(3,"boxer");
		Product p3=new Product(4,"speaker");
		Product p4=new Product(5,"antina");
		Product p5=new Product(6,"laptop");
		ps.addProduct(p);
		ps.addProduct(p1);
		ps.addProduct(p2);
		ps.addProduct(p3);
		ps.addProduct(p4);
		ps.addProduct(p5);
		ps.delProduct(p5);

		ps.updateProduct(3, "Mouse");
		List<Product> x=ps.listallProducts();
		System.out.println(x);
		Product m=ps.disponeProduct(3);
		System.out.println(m);
	}

}
