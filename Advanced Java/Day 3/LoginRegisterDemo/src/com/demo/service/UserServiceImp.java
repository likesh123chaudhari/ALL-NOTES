package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImp;
import com.demo.model.MyUser;

public class UserServiceImp implements UserService{
private UserDao uDao;

public UserServiceImp() {
	super();
	this.uDao = new UserDaoImp();
}

@Override
public void registerUser(MyUser u) {
 uDao.addUser(u);
}

@Override
public boolean validateData(String uname, String pass) {
	
	 return uDao.checkUser(uname, pass);
}

@Override
public MyUser findQuestion(String em) {
	return uDao.findQuestion(em);
}

@Override
public boolean modifyPassword(String email, String newpass) {
	return uDao.changePassword(email,newpass);
}


}
