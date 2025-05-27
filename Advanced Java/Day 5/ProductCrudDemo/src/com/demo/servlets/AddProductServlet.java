package com.demo.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/addproduct")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		int qty=Integer.parseInt(request.getParameter("qty"));
		float price=Float.parseFloat(request.getParameter("price"));
		String expdate=request.getParameter("expdate");
		int cid=Integer.parseInt(request.getParameter("cid"));
		LocalDate ldt=LocalDate.parse(expdate,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		Product p=new Product(pid,pname,qty,price,ldt,cid);
		ProductService pservice=new ProductServiceImpl();
		boolean status=pservice.addNewProduct(p);
		if(status) {
			RequestDispatcher rd=request.getRequestDispatcher("displayProductServlet");
			rd.forward(request, response);
		}
		
		
	}

}
