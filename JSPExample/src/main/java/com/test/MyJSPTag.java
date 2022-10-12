package com.test;

import java.sql.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyJSPTag extends TagSupport{
	
	public int doStartTag() {
		JspWriter out = null;
		
		try {
			out = pageContext.getOut();
			
			out.println("From Java Class MyTag1");
			
			Date date = new Date(0);
			
			out.println("<br><br>Current Date: " + date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
