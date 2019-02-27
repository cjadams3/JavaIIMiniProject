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
	<input type="hidden" name="id" value="${thisContact.id}">
	<label for="firstName">First Name</label>
	<input type="text" name="firstName" value="${thisContact.firstName}"><br/>
	<label for="lastName">Last Name</label>
	<input type="text" name="lastName" value="${thisContact.lastName}"><br/>
	<p>Date Of Birth</p>
	<label for="month">MM</label>
	<input type="text" style="width: 18px;" name="month" value="${thisMonth}">
	<label for="day">DD</label>
	<input type="text" style="width: 18px;" name="day" value="${thisDay}">
	<label for="year">YYYY</label>
	<input type="text" style="width: 35px;" name="year" value="${thisYear}"><br/>
	<label for="hNumber">House Number</label>
	<input type="text" style="width: 50px;" name="hNumber" value="${thisContact.houseNumber}"><br/>
	<label for="street">Street</label>
	<input type="text" name="street" value="${thisContact.street}"><br/>
	<label for="city">City</label>
	<input type="text" name="city" value="${thisContact.city}"><br/>
	<label for="state">State</label>
	<input type="text" style="width: 20px;" name="state" value="${thisContact.state}"><br/>
	<input type="submit" value="Submit">
</form>
</body>
</html>