package com.xworkz.chaining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class Product extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productName = req.getParameter("pdnm");
		String productQnt = req.getParameter("pdq");
		
		req.setAttribute("pName", productName);
		req.setAttribute("pqty", productQnt);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("cart");
		dispatcher.forward(req, resp);
	}

}
