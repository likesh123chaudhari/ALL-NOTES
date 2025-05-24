package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookieservlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String btn=request.getParameter("btn");
		switch(btn) {
		case "add":
			String key=request.getParameter("key");
			String val=request.getParameter("val");
			//generate cookie object
			Cookie c=new Cookie(key,val);
			//save the cookie in clients machine
			response.addCookie(c);
			out.println("<h1>Cookie added<h1>");
			
			break;
		case "del":
			 key=request.getParameter("key");
			 Cookie[] carr=request.getCookies();
			boolean status=false;
			for(Cookie c1:carr) {
				//delete the cookie
				if(c1.getName().equals(key)) {
					c1.setMaxAge(0);
					response.addCookie(c1);
					status=true;
					break;
				}
			}
			if(status) {
			   out.println("<h1>Cookie deleted"+key+" <h1>");
			}else {
				 out.println("<h1>Cookie not found "+key+" <h1>");
			}
			
			break;
		case "show":
			//display all cookies
			carr=request.getCookies();
			for(Cookie c2:carr) {
				out.println(c2.getName()+"---->"+c2.getValue()+"<br/>");
			}
			break;
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("cookiedemo.html");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
