package com.sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Session01
 */
@WebServlet("/Session01")
public class Session01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Youe name is "+name);
		out.println("<br>Your Password is "+password);
		Cookie c1 = new Cookie("name", name);
		Cookie c2 = new Cookie("password", password);
		
		response.addCookie(c1);
		response.addCookie(c2);
		out.println("<br><a href = 'Session02'>For more details Click here </a>");
	
	}

}
