<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form"	uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h3>Enter Your Login Credentials</h3>
		<h2>${message}</h2>
		<form:form action="admin" modelAttribute="userObj" method="POST">
			<table border="2">
			<tr>
				<td>User Name  <form:input path="enterpriseId"/></td>
				
			</tr>
			<tr>
				<td>Password   <form:password path="employeeId"/></td>
			
			</tr>
			
			</table>
			<input type="submit" value=" Login ">
		</form:form>
	</center>
</body>
</html>