package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet{
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("num1"));
		String op=request.getParameter("btn");
		switch(op) {
		case "add":
			int num2=Integer.parseInt(request.getParameter("num2"));
			int addition =num1+num2;
			out.println("<h1>Addition : "+addition+"</h1>");
			break;
		case "fact":
			int ans=factorial(num1);
			out.println("<h1>Factorial : "+ans+"</h1>");
		}
		
		out.println("Thank you for using do visit again......");
	}

}
