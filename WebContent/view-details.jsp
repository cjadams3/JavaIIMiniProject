<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Details</title>
</head>
<body>
<form method="post" action="contactActionServlet">
	<table>
		<tr>
			<td><input type="hidden" name="cID" value="${thisContact.id}"></td>
			<td>Phone Information For: ${thisContact.lastName}, ${thisContact.firstName}</td>
		</tr>
		<c:forEach items="${requestScope.phonesList}" var="thisItem">
			<tr>
				<td><input type="radio" name="pID" value="${thisItem.id}"></td>
				<td>Phone Type: ${thisItem.phoneType}</td>
				<td>Phone Number: ${thisItem.phoneNumber}</td>
			</tr>
		</c:forEach>
	</table>
	<input type="Submit" value="Edit Item" name="doThis">
	<input type="Submit" value="Delete Item" name="doThis">
	<input type="Submit" value="Add Item" name="doThis">
</form>
<a href="index.jsp">Return to Menu</a>
</body>
</html>