package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.MyUser;
import com.demo.service.UserService;
import com.demo.service.UserServiceImp;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name = request.getParameter("name1");
		String gender = request.getParameter("gender");
		String[] skill = request.getParameterValues("skill");
		String que = request.getParameter("que");
		String ans = request.getParameter("ans");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		MyUser u = new MyUser(name,gender, skill, que, ans, email, password);
		UserService uservice = new UserServiceImp();
		uservice.registerUser(u);
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}
}
