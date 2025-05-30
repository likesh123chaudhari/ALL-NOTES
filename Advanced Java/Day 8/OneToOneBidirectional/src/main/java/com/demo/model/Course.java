package com.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	private int duration;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Faculty fac;
	public Course() {
		super();
	}
	public Course(int cid, String cname, int duration, Faculty fac) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fac = fac;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Faculty getFac() {
		return fac;
	}
	public void setFac(Faculty fac) {
		this.fac = fac;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", fac=" + fac + "]";
	}
	

}
