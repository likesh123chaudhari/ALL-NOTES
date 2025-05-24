package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/counterservlet")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		System.out.println("session id : "+session.getId()+"----->"+session.isNew());
		Integer cnt=(Integer) session.getAttribute("cnt");
		if(session.isNew()) {
			session.setMaxInactiveInterval(120);
		}
		if(cnt==null) {
			cnt=1;
			session.setAttribute("cnt", cnt);
			
		}else {
			cnt++;
			session.setAttribute("cnt",cnt);
		}
		out.println("<h2> You clicked "+cnt+" times</h2>");
		RequestDispatcher rd=request.getRequestDispatcher("CounterClick.html");
		rd.include(request, response);
	}

}
