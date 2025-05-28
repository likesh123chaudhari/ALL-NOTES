package com.demo.tags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCalculateTag extends TagSupport{
	int num1,num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int doStartTag() {
		System.out.println("in doStartTag of calculatedemo");
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() {
		JspWriter out=pageContext.getOut();
		try {
			out.println("Numer 1 : "+num1);
			out.println("Numer 2 : "+num2);
			out.println("Addition : "+(num1+num2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
		
	}
	

}
