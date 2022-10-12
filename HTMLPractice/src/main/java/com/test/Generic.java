package com.test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
// Servlet implementation class Generic
 
@WebServlet("/Generic")
public class Generic extends GenericServlet {
	private static final long serialVersionUID = 1L;
       

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method");//1 - executes 
	}


	public void destroy() {
		System.out.println("Destroy method");
	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service method");//2
		System.out.println("processing request and response");//3
	}

}
