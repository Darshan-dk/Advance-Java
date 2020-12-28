package com.xworkz.chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cart")
public class Cart extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pdname = (String) req.getAttribute("pName");
		String pdqty = (String) req.getAttribute("pqty");
		
		int qty = Integer.parseInt(pdqty);
		
		double price=20000;
		double TotalSum=(price*qty);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("product details "+pdname+" Price"+TotalSum);
	}

}
