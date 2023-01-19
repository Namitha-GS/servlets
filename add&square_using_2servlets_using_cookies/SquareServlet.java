package com.namitha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int c = 0;
		Cookie cookies[] = req.getCookies();
		/* request will have multiple cookies, so it returns an array of cookies
		 * so we have to write logic to find it
		 */
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("c"))
				c  = Integer.parseInt(cookie.getValue());
		}
		c = c * c;
		PrintWriter out = res.getWriter();
		out.print("Result: "+c);
	}

}
