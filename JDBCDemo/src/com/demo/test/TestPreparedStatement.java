package com.demo.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPreparedStatement 
{
	public static void main(String[] args)
	{
		
		//step 1 register driver
		try 
	{
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		// step 2 get connection
		String url="jdbc:mysql://192.168.10.151/dac98?useSSL=false";
		Connection con=DriverManager.getConnection(url,"dac98","welcome");
		//step 3 Prepared Statement
		PreparedStatement ps =con.prepareStatement("select * from dept where loc=?");
		String pr="pune";
		ps.setString(1, pr);
		//excute
		ResultSet rs=ps.executeQuery();
		while(rs.next()) 
		{
			System.out.println("DeptNo:"+rs.getInt(1));
			System.out.println("Dname:"+rs.getString(2));
			System.out.println("LOC:"+rs.getString(3));
			System.out.println("PWD:"+rs.getString(4));
			System.out.println("Startedon:"+rs.getDate(5));
			
		}
		PreparedStatement ps1=con.prepareStatement("insert into dept values(?,?,?,?,?)");
		
		ps1.setInt(1,70);
		ps1.setString(2, "Testing");
		ps1.setString(3, "Nagpur");
		ps1.setString(4, "test@123");
		
		// local_date convert to sql
//		LocalDate ldt=LocalDate.now();
//		java.sql.Date dt=Date.valueOf(ldt);
		ps1.setString(5, "21/05/2025");
//		ps1.setDate(5, dt);
		
		int n=ps1.executeUpdate();
			if(n>0) 
			{
				System.out.println("Insertion is done");
				
			}
			else 
			{
				System.out.println("Insertion is not done");
			}
		
		
		if(con!=null) 
		{
			System.out.println("connection is done");
		}
		
	}
		 catch (SQLException e)
		 {
			
			System.out.println("connection is lost");
			
		 }
		
	}

}
