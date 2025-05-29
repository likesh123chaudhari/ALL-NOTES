package com.demo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//it will retrive all selected product information from database and save it in the cart
	//also saves the cart in the session
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String btn=request.getParameter("btn");
		HttpSession session=request.getSession();
		List<Product> cart=(List<Product>) session.getAttribute("cart");
		switch(btn) {
		case "cart":
			String[] parr=request.getParameterValues("products");
			ProductService pservice=new ProductServiceImpl();
			List<Product> plist=pservice.findManyByCid(parr);
			if(cart==null) {
				System.out.println("in cart==null");
				cart=new ArrayList<>(plist);
				
				
			}else {
				for(Product p: plist) {
					cart.add(p);
				}
				
			}
			session.setAttribute("cart", cart);
			cart.forEach(System.out::println);
			System.out.println("-------------------");
			RequestDispatcher rd=request.getRequestDispatcher("findcategory");
			rd.forward(request,response);
		break;
		case "order":
			 rd=request.getRequestDispatcher("displaycart.jsp");
			 rd.forward(request,response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
