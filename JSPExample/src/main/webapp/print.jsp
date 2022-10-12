
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Print Form</title>
</head>
<body>

<h1>Printing user name</h1>
  
<%
String usr = request.getParameter("user");//request is an inbuilt object in jsp.
String pass = request.getParameter("pwd");
if(usr.equals("suga"))
{
	RequestDispatcher rd=request.getRequestDispatcher("");
	rd.forward(request, response);
	out.println("User name correct");
}
else
{
	out.println("User name incorrect.");
	RequestDispatcher rd = request.getRequestDispatcher("");
	rd.include(request, response);
}

%>

<!-- <form action="emp.jsp" method="get">
<h1>Employee details</h1>
EmpID: <input type="text" name="id"><br><br>
EmpName : <input type="text" name ="name"><br><br>
EmpCity : <input type="text" name ="city"><br><br>
<input type ="submit" value = "Submit"/>
</form>
 -->
</body>
</html>