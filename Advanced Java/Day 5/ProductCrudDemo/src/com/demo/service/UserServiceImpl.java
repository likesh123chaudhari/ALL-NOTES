package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.MyUser;

public class UserServiceImpl implements UserService{
	private UserDao udao;
	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}
	@Override
	public MyUser validateUser(String uname, String pass) {
		return udao.findUserByUname(uname,pass);
	}

}
