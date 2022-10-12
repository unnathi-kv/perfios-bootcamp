<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Tracking</title>
</head>
<body>
<h1>Session Tracking Example</h1>
<%
String usr = request.getParameter("user");//request is an inbuilt object in jsp.
String pass = request.getParameter("pwd");
if(usr.equals("suga"))
{
	/* RequestDispatcher rd=request.getRequestDispatcher("");
	rd.forward(request, response);
	out.println("User name correct"); */
	session.setAttribute("info",usr);
	
	out.println("From session jsp "+usr);
	
}
else
{
	/* out.println("User name incorrect.");
	RequestDispatcher rd = request.getRequestDispatcher("");
	rd.include(request, response); */
	out.println("Invalid credentials");
}

%>
</body>
</html>