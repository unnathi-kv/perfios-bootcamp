<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invoice</title>
</head>
<link rel="stylesheet" href="style/style.css" type="text/css" media="screen" />

<body>
<form action = "track.jsp"> 
<h2>Courier Invoice</h2><br><br>
 	<table align="center" cellpadding="15" border="1" style="background-color: white;">
			<tr>
					
					<th>Customer Name</th>
					<th>City</th>
					<th>Delivery Address</th>
					<th>Amount Payable</th>
					<th>Weight of the parcel </th>
					<th>Mobile Number</th>
				
				</tr>
				<tr>
						<td><%=session.getAttribute("cust_name") %></td>
						<td><%= session.getAttribute("cust_city") %></td>
						<td><%= session.getAttribute("delivery_area")%></td>
						<td><%= session.getAttribute("amount") %></td>
						<td><%= session.getAttribute("weight") %></td>
						<td><%= session.getAttribute("mobileno") %></td>
	
					</tr>
				</table>
	  <input type ="submit" class="button" value="Pay"/>  
</form>	 	  	
</body>
</html>