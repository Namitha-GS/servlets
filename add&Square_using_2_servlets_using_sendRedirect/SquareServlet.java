package com.namitha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int c = Integer.parseInt(req.getParameter("added_result"));
		c = c * c;
		PrintWriter out = res.getWriter();
		out.print("Result: "+c);
	}

}
