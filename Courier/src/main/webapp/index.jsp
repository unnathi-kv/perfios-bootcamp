<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Courier</title>
</head>
<link rel="stylesheet" href="style/style.css" type="text/css" media="screen" />

<body>
<form action = "BookCourier">
<div class="register-form">
<h2>Enter the details of courier</h2><br><br>

 <label  class="label-title">Customer name</label><br>
 <input type="text" name="cust_name" class="form-input" placeholder="Enter name"/><br><br>

 <label  class="label-title">City</label><br>
	<select name="cust_city" id="city" style="width:900px; height:40px;"> 
   	<option value="Bangalore">Bangalore</option>
   	<option value="Mumbai">Mumbai</option>
   	<option value="Chennai">Chennai</option>
 </select><br><br>
 
 <label  class="label-title">Mobile number</label><br>
 <input type="text" name="mobileno" class="form-input" placeholder="Enter mobile number"/><br><br>
 
 <label  class="label-title">Delivery area</label><br>
	<select name="delivery_area" id="delivery_area" style="width:900px; height:40px;"> 
   	<option value="Bangalore">Bangalore</option>
   	<option value="Mumbai">Mumbai</option>
   	<option value="Chennai">Chennai</option>
 </select><br><br>
 
 <label class="label-title">Weight</label><br>
 <input type="text" name="weight" class="form-input" placeholder="Enter weight (in grams)"/><br><br>
 

 <input type ="submit" class="button" value="Book"/>  
 </div> 
 </form>    
</body>
</html>