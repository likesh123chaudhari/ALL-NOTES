package com.demo.model;

import java.util.Arrays;

public class MyUser {
private String name;
private String gender;
private String[] skill;
private String que;
private String ans;
private String email;
private String password;
public MyUser() {
	super();
}
public MyUser(String name, String gender, String[] skill, String que, String ans, String email, String password) {
	super();
	this.name = name;
	this.gender = gender;
	this.skill = skill;
	this.que = que;
	this.ans = ans;
	this.email = email;
	this.password = password;
}

public MyUser(String que, String ans, String email) {
	super();
	this.que = que;
	this.ans = ans;
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String[] getSkill() {
	return skill;
}
public void setSkill(String[] skill) {
	this.skill = skill;
}
public String getQue() {
	return que;
}
public void setQue(String que) {
	this.que = que;
}
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "MyUser [name=" + name + ", gender=" + gender + ", skill=" + Arrays.toString(skill) + ", que=" + que
			+ ", ans=" + ans + ", email=" + email + ", password=" + password + "]";
}


}
