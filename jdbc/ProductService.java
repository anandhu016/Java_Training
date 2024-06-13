package com.ey.day13task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
	
	public void addProduct(Product product) throws Exception {
		Connection con=DbConn.getConenction();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?)");
			pst.setInt(1, product.id);
			pst.setString(2, product.name);
			pst.execute();//run
		}
	public void delProduct(Product product) throws Exception {
		Connection con=DbConn.getConenction();
		Statement st=con.createStatement();
		int a=product.id;
		PreparedStatement pst=con.prepareStatement("delete from product where id=?");
		pst.setInt(1, product.id);
		pst.executeUpdate();
		}
	
	public void updateProduct(int m,String b) throws Exception {
		Connection con=DbConn.getConenction();
		Statement st=con.createStatement();
		PreparedStatement pst=con.prepareStatement("update product set name=? where id=?");
		pst.setInt(2, m);
		pst.setString(1, b);
		pst.executeUpdate();
		}
	List<Product> listallProducts() throws Exception{
		List<Product> l=new ArrayList<Product>();
		Integer o = null;
		String p = null;
		Connection con=DbConn.getConenction();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next()) {
			o=rs.getInt(1);
			p=rs.getString(2);
			Product x=new Product(o, p);
			l.add(x);
		}
		return l;
		
	}
	
	Product disponeProduct(Integer id) throws Exception {
		Integer o = null;
		String p = null;
		Connection con=DbConn.getConenction();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product where id="+id+"");
		while(rs.next()) {
			o=rs.getInt(1);
			p=rs.getString(2);
		}
		
		Product p1=new Product(o, p);
		return p1;
			
	}
	

}
