package com.demo.dao;

import com.demo.model.MyUser;

public interface UserDao {

	MyUser findUserByUname(String uname, String pass);

}
