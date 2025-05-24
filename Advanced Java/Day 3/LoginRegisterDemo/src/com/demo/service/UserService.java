package com.demo.service;

import com.demo.model.MyUser;

public interface UserService {

	void registerUser(MyUser u);

	boolean validateData(String uname, String pass);

	MyUser findQuestion(String em);

	boolean modifyPassword(String email, String newpass);

}
