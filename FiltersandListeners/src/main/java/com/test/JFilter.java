package com.test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class JFilter
 */
@WebFilter("/JFilter")
public class JFilter extends HttpFilter implements Filter {
  
	public void destroy() {
		System.out.println("destroy()");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// place your code here
		System.out.println("Before servlet");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("After servlet");
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

}
