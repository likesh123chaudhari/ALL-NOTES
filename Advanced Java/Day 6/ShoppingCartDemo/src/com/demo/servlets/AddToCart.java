package com.demo.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] parr=request.getParameterValues("products");
		ProductService pservice=new ProductServiceImpl();
		List<Product> plist=pservice.findManyByCid(parr);
		System.out.println(Arrays.toString(parr));
		plist.forEach(System.out::println);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
