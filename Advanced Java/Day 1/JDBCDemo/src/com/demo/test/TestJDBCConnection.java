package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCConnection {
	public static void main(String[] args) {
		
		try {
			//step 1-register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2-get connection
			String url="jdbc:mysql://localhost:3306/test?useSSL=false";
			Connection con=DriverManager.getConnection(url,"root","root123");
			if(con!=null) {
				System.out.println("connection done!!!");
			}
			
			//step 3-- create statement
			Statement st=con.createStatement();
			String uname="xxx";
			String password="yyy' or '1'='1";
					
			String str="select * from user where uname='"+uname+"'and passwd='"+password+"'";
			System.out.println(str);
					//step4---execute query
			ResultSet rs=st.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("qty : "+rs.getInt(3));
				System.out.println("price : "+rs.getFloat(4));
				System.out.println("expdate :"+rs.getDate(5));
				System.out.println("cid: "+rs.getInt(6));
			}
			int n=st.executeUpdate("insert into product values(11,'dddd',34,345,'2026-11-11',1)");
			if(n>0) {
				System.out.println("insertion done");
			}
		} catch (SQLException e) {
				System.out.println("Error occured, connection not done");
		}
		
	}

}
