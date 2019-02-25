<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Contacts</title>
</head>
<body>
	<table>
		<c:forEach items="${requestScope.allContacts}" var="currentitem">
		<tr>
			<td><input type="radio" name="id" value="${currentitem.id}"></td>
			<td>First Name: ${currentitem.firstName}</td>
			<td>Last Name: ${currentitem.lastName}</td>
			<td>Birth Date: ${currentitem.birthDate}</td>
			<td>House Number: ${currentitem.houseNumber}</td>
			<td>Street: ${currentitem.street}</td>
			<td>City: ${currentitem.city}</td>
			<td>State: ${currentitem.state}</td>
		</tr>
		</c:forEach>
	</table>
	<input type="submit" value="View Details" name="doThis">
	<input type="submit" value="Edit Contact Info" name="doThis">
	<input type="submit" value="Delete Person" name="doThis">
	<a href="index.jsp">Return to Menu</a>
</body>
</html>