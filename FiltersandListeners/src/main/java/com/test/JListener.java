package com.test;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//count of total and current users
@WebListener
public class JListener implements HttpSessionListener {

  public static ServletContext ctx = null;
  public int total, current =0;

	
    public void sessionCreated(HttpSessionEvent se)  { 
    	total++;
    	current++;
    	ctx = se.getSession().getServletContext();
    	ctx.setAttribute("totalusers", total);
    	ctx.setAttribute("currentusers", current);
    	
             }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	current--;
    	ctx.setAttribute("currentusers", current);
    	
             }
	
}
