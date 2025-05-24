package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.UserService;
import com.demo.service.UserServiceImp;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String uname = request.getParameter("uname");
	String pass = request.getParameter("pass");
	UserService uservice = new UserServiceImp();
	boolean status = uservice.validateData(uname,pass);
	if(status) {
		out.println("<h1>valid User</h1>");
	}else {
		out.println("<h1>Wrong Credentials</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.include(request, response);
	}
	
	}
}
