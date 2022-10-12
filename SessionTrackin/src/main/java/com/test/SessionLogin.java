package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SessionLogin
 */
@WebServlet("/SessionLogin")
public class SessionLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String usr = request.getParameter("user");
		String password = request.getParameter("pwd");
		
//		Cookie ck = new Cookie("info",usr);
		
		
//		response.addCookie(ck);//we have to add the cookie in response.
		
		HttpSession session = request.getSession();
		session.setAttribute("info", usr);
		
		out.println("Username from login servlet : "+usr);
		
		out.println("<br><br><a href='LoginServlet2'> next page </a>");
		
	}

}
