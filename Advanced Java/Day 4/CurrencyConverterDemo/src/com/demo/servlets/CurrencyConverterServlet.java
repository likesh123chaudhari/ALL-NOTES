package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/currencyconverter",
initParams= {@WebInitParam(name="drate",value="85"),
		@WebInitParam(name="erate",value="80"),
		@WebInitParam(name="prate",value="90")})
public class CurrencyConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private float drate,erate,prate;
	public void init(ServletConfig config) {
		drate=Float.parseFloat(config.getInitParameter("drate"));
		prate=Float.parseFloat(config.getInitParameter("prate"));
		erate=Float.parseFloat(config.getInitParameter("erate"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double amt=Double.parseDouble(request.getParameter("amt"));
		String currency=request.getParameter("curr");
		double famt=0;
		switch(currency) {
		case "dollar":
			famt=amt/drate;
			break;
		case "euro":
			famt=amt/erate;
			break;
		case "pounds":
			famt=amt/prate;
			break;
		}
		out.println("Amount: "+amt);
		out.println("Converted to : "+currency);
		out.println("Converted Amt: "+famt);
		out.println("<a href='currency.html'>To convert more click here</a>");
		
		
		
	}

}
