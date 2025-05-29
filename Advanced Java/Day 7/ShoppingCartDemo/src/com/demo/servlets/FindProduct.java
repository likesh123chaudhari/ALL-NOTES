package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import java.util.List;


@WebServlet("/findproduct")
public class FindProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	//it will retrive all products of a particular category from database 
	//and send it displayproduct.jsp to show it in checkbox format 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String btn=request.getParameter("btn");
		switch(btn) {
		case "find":
			int cid=Integer.parseInt(request.getParameter("cid"));
			ProductService pservice=new ProductServiceImpl();
			List<Product> plist=pservice.findAllProduct(cid);
			request.setAttribute("plist", plist);
			RequestDispatcher rd=request.getRequestDispatcher("displayproduct.jsp");
			rd.forward(request, response);
		break;
		case "order":
			//it will send to displayorder.jsp page, to see all the products in the cart
			 rd=request.getRequestDispatcher("displaycart.jsp");
			rd.forward(request, response);
			
		
		}
		
	}

}
