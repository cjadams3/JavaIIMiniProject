<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Phone Info</title>
</head>
<body>
	<form method="post" action="addNewPhoneServlet">
		<label for="type">Phone Type (e.g. Home, Work, Cell, etc)</label>
		<input type="text" name="type"><br>
		<label for="number">Phone Number</label>
		<input type="text" name="number"><br>
		<input type="submit" value="Submit">
		<input type="hidden" name="id" value="${ContactInfo.id}">
		<input type="hidden" name="fName" value="${ContactInfo.firstName}">
		<input type="hidden" name="lName" value="${ContactInfo.lastName}">
		<input type="hidden" name="bDate" value="${ContactInfo.birthDate}">
		<input type="hidden" name="hNumber" value="${ContactInfo.houseNumber}">
		<input type="hidden" name="street" value="${ContactInfo.street}">
		<input type="hidden" name="city" value="${ContactInfo.city}">
		<input type="hidden" name="state" value="${ContactInfo.state}">
		</form>
</body>
</html>