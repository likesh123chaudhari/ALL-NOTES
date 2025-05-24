package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.MyUser;
import com.demo.service.UserService;
import com.demo.service.UserServiceImp;

public class ForgotPassword extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String em=request.getParameter("email");
		UserService uservice=new UserServiceImp();
		//find secrete question from databse
		MyUser u=uservice.findQuestion(em);
		out.println("<form action='changepassword' method='post'>");
		out.println("Question : <input type='text' name='que' id='que' value='"+u.getQue()+"' readonly/>");
		out.println("Answer : <input type='text' name='ans' id='ans'> ");
		out.println("<input type='hidden' name='myans' id='myans' value='"+u.getAns()+"'> ");
		out.println("<input type='hidden' name='email' id='email' value='"+u.getEmail()+"'> ");
		out.println("New Password : <input type='password' name='npass' id='npass'> ");
		out.println("Retype Password : <input type='password' name='cpass' id='cpass'> ");
		out.println("<button type='submit' name='btn' id='btn'>Submit</button> ");
		out.println("</form>");
	}

}
