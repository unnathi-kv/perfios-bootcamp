<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="emp" class="com.test.Employee"></jsp:useBean><!-- "emp" is object of class Employee -->
 
 <jsp:setProperty property="*" name="emp"/>
 
 <jsp:getProperty property="id" name="emp"/><br>
 
 <jsp:getProperty property="name" name="emp"/><br>
 
 <jsp:getProperty property="city" name="emp"/><br>
 
 
</body>
</html>