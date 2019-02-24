<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Contact</title>
</head>
<body>
<form method="post" action="addNewContactServlet">
	<label for="firstName">First Name</label>
	<input type="text" name="firstName"><br/>
	<label for="lastName">Last Name</label>
	<input type="text" name="lastName"><br/>
	<p>Date Of Birth</p>
	<label for="month">MM</label>
	<input type="text" style="width: 18px;" name="month">
	<label for="day">DD</label>
	<input type="text" style="width: 18px;" name="day">
	<label for="year">YYYY</label>
	<input type="text" style="width: 35px;" name="year"><br/>
	<label for="hNumber">House Number</label>
	<input type="text" style="width: 50px;" name="hNumber"><br/>
	<label for="street">Street</label>
	<input type="text" name="street"><br/>
	<label for="city">City</label>
	<input type="text" name="city"><br/>
	<label for="state">State</label>
	<input type="text" style="width: 18px;" name="state">
	<input type="submit" value="Submit">
</form>
</body>
</html>