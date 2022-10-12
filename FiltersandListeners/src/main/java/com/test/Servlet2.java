package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String usr = request.getParameter("user");
		String password = request.getParameter("pwd");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("info", usr);
		
		out.println("<h3> User : " +usr+"</h3>");
		
		ServletContext ctx = getServletContext();
		 
		int t = (int)ctx.getAttribute("totalusers");
		int c = (int)ctx.getAttribute("currentusers");
		
		out.println("<br><br><h2> Total users : "+t+"  </h2>");  
			
		out.println("<br><h2> Current users : "+c+"  </h2>");
		
		out.println("<br><a href='LogoutServlet'> log out </a>");
	}

}
