package com.demo.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPrepareStatement {

	public static void main(String[] args) {
		//step 1-register driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2-get connection
			String url="jdbc:mysql://localhost:3306/test?useSSL=false";
			Connection con=DriverManager.getConnection(url,"root","root123");
			PreparedStatement ps=con.prepareStatement("select * from product where price>?");
			float pr=50;
			ps.setFloat(1,pr);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("qty : "+rs.getInt(3));
				System.out.println("price : "+rs.getFloat(4));
				System.out.println("expdate :"+rs.getDate(5));
				System.out.println("cid: "+rs.getInt(6));
			}
			PreparedStatement ps1=con.prepareStatement("insert into product values(?,?,?,?,?,?)");
			ps1.setInt(1, 222);
			ps1.setString(2, "rrrr");
			ps1.setInt(3, 50);
			ps1.setFloat(4, 3456);
			LocalDate ldt=LocalDate.now();
			java.sql.Date dt=Date.valueOf(ldt);
			ps1.setDate(5, dt);
			ps1.setInt(6, 1);
			int n=ps1.executeUpdate();
			
			if(n>0) {
				System.out.println("insertion done");
			}else {
				System.out.println("insertion not done");
			}
			if(con!=null) {
				System.out.println("connection done!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
