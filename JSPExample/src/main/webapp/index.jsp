<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	
	<!--  Declaration Tag - to declare variables,methods-->
	<%!
	int a =10;
	int b =20;
	public int add(int a,int b){
		return a+b;
	}
	%>
	<!-- Expression tag-to print the data -->
	<%=add(10,30) %><!-- prints 50 -->
	
	<!-- Scriplet tag-pure java tag -->
	<%
	out.println("JSP tag <br>");//break works inside println() also.
	
	%><br>
	<%
	out.println("Current Date : " +new Date());
	%>
	
	
	
</body>
</html>