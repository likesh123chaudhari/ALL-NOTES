package com.demo.dao;

import com.demo.model.MyUser;

public interface UserDao {

	void addUser(MyUser u);

	boolean checkUser(String uname, String pass);

	MyUser findQuestion(String em);

	boolean changePassword(String email, String newpass);

}
