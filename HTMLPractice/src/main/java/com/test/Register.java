package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class Register

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");// to get request from html to java
		
		PrintWriter out = response.getWriter();//to print data on browser
		
		
		String user = request.getParameter("user");
		String password = request.getParameter("pwd");
		String firstname = request.getParameter("fname");
		
		if(password != null)
		{
			out.println("Hurray!! Registration Success.");
		}
		else
		{
			out.println("Aww :( Registration Failed.");
		}
	
	}

}
