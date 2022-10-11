
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courier Status</title>
</head>
<link rel="stylesheet" href="style/style.css" type="text/css" media="screen" />
<body>
<h2>Courier Status</h2><br><br>
  <%
	try {
		response.setContentType("text/html");
		
		RequestDispatcher dispatcher;
		
		session = request.getSession();
		
		String courier_id = CustomerDao.generateCourierId();
			
		    String sql = "update details set courier_tracking_no = " + courier_id + " where cust_name = '"+session.getAttribute("cust_name")+ "';";
			int x = CustomerDao.getStatement().executeUpdate(sql);
			
			
			String sql1 = "select * from details where cust_name = '"+session.getAttribute("cust_name")+"';";
			ResultSet rs = CustomerDao.getStatement().executeQuery(sql1);
	%>
	
			<table align="center" cellpadding="15" border="1" style="background-color: white;">
			<tr>
					<th>Courier Id</th>
					<th>Name</th>
					<th>From</th>
					<th>To</th>
					<th>Amount Paid</th>
					<th>Weight</th>
					<th>Shipment Date</th>
					<th>Delivery Date</th>
					<th>Mobile Number</th>
				
				</tr>
				
		<%
				while(rs.next()) {
					//System.out.println("inside trans");
		%>
							
					<tr>
						<td><%=rs.getString("courier_tracking_no") %></td>
						<td><%= rs.getString("cust_name") %></td>
						<td><%= rs.getString("cust_city") %></td>
						<td><%= rs.getString("delivery_area") %></td>
						<td><%= rs.getDouble("amount") %></td>
						<td><%= rs.getDouble("courier_weight") %></td>
						<td><%= rs.getString("shipment_date") %></td>
						<td><%= rs.getString("delivery_date") %></td>
						<td><%=rs.getString("mobileno") %></td>
						
					</tr>
		<%
					}
	
	}
   catch (Exception e)
    {
		e.printStackTrace();
	}
	%>
	</table>
	<a href="home.html">
	        <input type ="submit" class="button" value="Back"/>
	</a>

</body>
</html>