package com.packt.cookbook;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;

public class App extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		response.setContentType("text/html");

		java.io.PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println("<h1>Hola Mundo!</h1>");
		double bar = Math.pow(22,22);
		double foo = Math.sqrt(bar);
		out.println("<h2>bar es "+ bar +"</h2>");
		out.println("<h2>foo es "+ foo +"</h2>");
		out.println("</body></html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
	}
}
