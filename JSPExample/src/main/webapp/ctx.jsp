<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String city = application.getInitParameter("city");//application is the inbuilt object of ServletContext
out.println("City  : "+city);

%>
</body>
</html>