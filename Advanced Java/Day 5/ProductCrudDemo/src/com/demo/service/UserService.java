package com.demo.service;

import com.demo.model.MyUser;

public interface UserService {

	MyUser validateUser(String uname, String pass);

}
