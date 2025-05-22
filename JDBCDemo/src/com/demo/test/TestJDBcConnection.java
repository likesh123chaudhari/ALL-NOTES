package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBcConnection 
{
	public static void main(String[] args) 
	{
		//step 1 : register driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		//step 2 : get Connection
		String url = "jdbc:mysql://192.168.10.151:3306/dac98?useSSL=false";
		//String url = "jdbc:mysql://192.168.10.151/dac98?useSSL=false";
		
		Connection con = DriverManager.getConnection(url, "dac98", "welcome");
		
		if(con != null)
		{
			System.out.println("connection done!!");
		}
		
		//step 3 : create statement
		Statement st = con.createStatement();
		String uname = "sujata";
		String password = "yyy' or '1' = '1";
		
		String str = "select * from user where uname='"+uname+"' and password='"+password+" ' ";
		
		System.out.println(str);
		
		System.out.println("--------------------------------------");
		
		//step 4 : execute the query
		ResultSet res = st.executeQuery("select * from dept");
		
		while(res.next())
		{
			System.out.println("DEPTNO" + res.getInt(1));
			System.out.println("DNAME" + res.getString(2));
			System.out.println("LOC" + res.getString(3));
			System.out.println("PWD" + res.getString(4));
			System.out.println("STARTEDON" + res.getString(5));
			
			System.out.println("--------------------------------------");
		}
		
		//here we can use dml queries insert or update
		int n = st.executeUpdate("insert into dept values(60, 'Development', 'mumbai', 'dev@123', '21/05/2025')");
		
		if(n>0)
		{
			System.out.println("Insertion done!!");
		}
		
		} catch (SQLException e) {
			
			System.out.println("Connection is not done!");
			
		}
		
	}
}
