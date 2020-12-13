package com.xworkz.xworkzapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/weapon")
public class Weapon extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletContext context = getServletContext();
		
		String contexts = context.getInitParameter("offers");
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.print(contexts);
		
		
	}
}
