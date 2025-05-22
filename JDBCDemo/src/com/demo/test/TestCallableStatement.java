package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TestCallableStatement 
{

	public static void main(String[] args) 
	{
		//step 1 : register driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		
		//step 2 : get connection
		String url="jdbc:mysql://192.168.10.151/dac98?useSSL=false";
		Connection con=DriverManager.getConnection(url,"dac98","welcome");
		
		//step 3 : callable statement
		CallableStatement cs = con.prepareCall("{call getcnt(?,?)}");
		
		cs.setInt(1, 10);  
		cs.registerOutParameter(2, Types.INTEGER); //for output parameter
		cs.execute();  //returns true or false
		int cnt = cs.getInt(2); //retrieve value
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
