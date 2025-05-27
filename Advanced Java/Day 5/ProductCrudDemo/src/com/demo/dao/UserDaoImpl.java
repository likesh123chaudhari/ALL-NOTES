package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.MyUser;

public class UserDaoImpl implements UserDao{
    static Connection con;
    static PreparedStatement findUser;
    static {
    	con=DBUtil.getMyconnection();
    	try {
			findUser=con.prepareStatement("select email,password,name from myuser where email=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public MyUser findUserByUname(String uname, String pass) {
		try {
			findUser.setString(1, uname);
			findUser.setString(2, pass);
			ResultSet rs=findUser.executeQuery();
			if(rs.next()) {
				MyUser u=new MyUser(rs.getString(3),null,null,null,null,rs.getString(1),rs.getString(2));
				return u;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;	
		
	}
	

}
