<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Phone Program</title>
</head>
<body>
<form method="post" action="navigationServlet">
	<select name="action">
		<option value="add">Add a Contact</option>
		<option value="view">View List of Contacts</option>
	</select>
	<input type="submit" value="Submit" />
	</form>
</body>
</html>