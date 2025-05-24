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

public class ChangePassword extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String myans=request.getParameter("myans");
		String ans=request.getParameter("ans");
		if(myans.equals(ans)) {
			UserService uservice=new UserServiceImp();
			String newpass=request.getParameter("npass");
			String email=request.getParameter("email");
			boolean status=uservice.modifyPassword(email,newpass);
			if(status) {
				out.println("<h1>Password modified, pls relogin</h1>");
				
			}else {
				out.println("<h1>you are not autherized to change password</h1>");
				
			}
		}else {
			out.println("<h1>you are not autherized to change password</h1>");
			
		}
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.include(request, response);
		
	}

}
