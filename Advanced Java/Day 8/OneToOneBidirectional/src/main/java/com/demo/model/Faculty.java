package com.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	@Id
   private int fid;
   private String fname;
   private String skill;
   //mappedBy means do not add foreign key in the faculty table
   @OneToOne(mappedBy="fac",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
   private Course cr;
public Faculty() {
	super();
}
public Faculty(int fid, String fname, String skill, Course cr) {
	super();
	this.fid = fid;
	this.fname = fname;
	this.skill = skill;
	this.cr = cr;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public Course getCr() {
	return cr;
}
public void setCr(Course cr) {
	this.cr = cr;
}
@Override
public String toString() {
	return "Faculty [fid=" + fid + ", fname=" + fname + ", skill=" + skill + ", cr=" + cr + "]";
}
   
}
