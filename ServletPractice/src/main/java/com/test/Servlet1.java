package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 // Servlet implementation class Servlet1
 
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	ServletContext ctx = getServletContext();
	String ct = ctx.getInitParameter("city");

	String st = ctx.getInitParameter("state");
	
	
	String dt = ct +" "+st;
	
	out.println("from servlet1 : "+dt);
	ctx.setAttribute("info", dt);//"info" is the key and dt is the value for the key.
	
	ServletConfig cfg = getServletConfig();
	String usr = cfg.getInitParameter("user");
	String pass = cfg.getInitParameter("pwd");
	
	out.println("<br> Username : "+usr+"<br> Pasword : "+pass);
	out.println("<a href='Servlet2'> go to next page</a>");
	
	
	
	
	}

}
