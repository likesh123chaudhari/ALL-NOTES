package com.demo.tags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyHelloTag extends TagSupport{
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int doStartTag() {
		System.out.println("in doStartTag of Hellotag");
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() {
		JspWriter out=pageContext.getOut();
		try {
			out.println("welcome to custom hello tag");
			out.println("Hello "+fname+"  "+lname);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
		
	}

}
