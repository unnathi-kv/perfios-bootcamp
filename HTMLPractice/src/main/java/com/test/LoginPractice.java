package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class Login
 
@WebServlet("/Login")
public class LoginPractice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");// to get request from html to java
		
		PrintWriter out = response.getWriter();//to print data on browser
		
		String user = request.getParameter("user");
		
		String password= request.getParameter("pwd");
		//to update in database 
		User user1 = new User();
		user1.setUserName(user);
		user1.setPassword(password);
		Util util1 = new Util();
		util1.saveUser(user1);
		
		if(user.equals("admin") && password.equals("a123"))
		{
			out.println("Login success");
		}
		else {
			out.println("Invalid credentials");
		    }
		
		
	}

}
