package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.MyUser;

public class UserDaoImp implements UserDao {
static Connection conn ;
static PreparedStatement insUser, selUser,selQue,changepass;

static {
	conn= DBUtil.getMyconnection();
	try {
		insUser= conn.prepareStatement("insert into myuser values(?,?,?,?,?,?,?)");
		selUser = conn.prepareStatement("select email, password from myuser where email=?  and password = ?");
		selQue=conn.prepareStatement("select * from myuser where email=?");
		changepass=conn.prepareStatement("update myuser set password=? where email=?");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Override
	public void addUser(MyUser u) {
		try {
			insUser.setString(1,u.getName());
			insUser.setString(2,u.getGender());
			insUser.setString(3,String.join(",",u.getSkill()));
			insUser.setString(4,u.getQue());
			insUser.setString(5,u.getAns());
			insUser.setString(6,u.getEmail());
			insUser.setString(7,u.getPassword());
			int n = insUser.executeUpdate();
			if(n>0) {
				System.out.println("User Added");
			}else {
				System.out.println("Duplicate User");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean checkUser(String uname, String pass) {
		try {
			selUser.setString(1,uname);
			selUser.setString(2, pass);
			
			ResultSet rs = selUser.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(uname) && rs.getString(2).equals(pass)) {
					return true;
				}
			}
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	@Override
	public MyUser findQuestion(String em) {
		try {
			selQue.setString(1, em);
			ResultSet rs=selQue.executeQuery();
			if(rs.next()) {
				MyUser u=new MyUser(rs.getString(4),rs.getString(5),rs.getString(6));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public boolean changePassword(String email, String newpass) {
		try {
			changepass.setString(1, newpass);
			changepass.setString(2, email);
			int n=changepass.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
