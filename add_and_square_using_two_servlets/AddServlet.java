package com.namitha;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int c = a + b;
		
		// now we need to pass 'c' to SquareServlet
		// if you want to pass data from 1 servlet to another, we use
		// Session management
		
		req.setAttribute("added_result", c);
		
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
	}

}
