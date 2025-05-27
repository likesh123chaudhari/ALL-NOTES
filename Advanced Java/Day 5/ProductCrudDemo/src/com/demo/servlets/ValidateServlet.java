package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.model.MyUser;
import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

 
@WebServlet("/validateuser")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		UserService uservice=new UserServiceImpl();
		MyUser u=uservice.validateUser(uname,pass);
		if(u!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("user", u);
			RequestDispatcher rd=request.getRequestDispatcher("displayProductServlet");
			rd.forward(request, response);
		}else{
			//redirect to login page
			out.println("<h3>Wrong credentials!!");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		
	}

}
