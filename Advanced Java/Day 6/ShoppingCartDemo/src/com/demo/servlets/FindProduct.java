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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid=Integer.parseInt(request.getParameter("cid"));
		ProductService pservice=new ProductServiceImpl();
		List<Product> plist=pservice.findAllProduct(cid);
		request.setAttribute("plist", plist);
		RequestDispatcher rd=request.getRequestDispatcher("displayproduct.jsp");
		rd.forward(request, response);
	}

}
