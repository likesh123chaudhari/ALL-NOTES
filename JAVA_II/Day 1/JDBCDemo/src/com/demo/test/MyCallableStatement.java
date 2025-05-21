package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class MyCallableStatement {
public static void main(String[] args) {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2-get connection
		String url="jdbc:mysql://localhost:3306/test?useSSL=false";
		Connection con=DriverManager.getConnection(url,"root","root123");
		CallableStatement cs=con.prepareCall("{call getcnt(?,?)}");
		cs.setInt(1, 10);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		int cnt=cs.getInt(2);
		System.out.println("count : "+cnt);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
