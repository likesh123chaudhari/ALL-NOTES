package com.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Category;
import com.demo.service.CategoryService;
import com.demo.service.CategoryServiceImpl;


@WebServlet("/findcategory")
public class FindCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService cservice=new CategoryServiceImpl();
		List<Category> clist=cservice.getAllCategory();
		request.setAttribute("clist", clist);
		RequestDispatcher rd=request.getRequestDispatcher("displaycategory.jsp");
		rd.forward(request, response);
		
	}

}
