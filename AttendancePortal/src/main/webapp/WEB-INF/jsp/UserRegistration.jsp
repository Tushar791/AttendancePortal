<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h2>Add User Details</h2>
		
		<form:form modelAttribute="userObj" method="POST"
			action="saveUser">

			<br>

			<table border="2">
				<tr>
					<th>Name</th>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<th>EnterpriseID</th>
					<td><form:input path="enterpriseId" /></td>
				</tr>
				<tr>
					<th>EmployeeID</th>
					<td><form:input path="employeeId" /></td>	
				</tr>
			</table>
			<br />
			<input type="submit" value="save" />
			<br />
			<br />
			<a href="index.html"> Home</a>
	   	
		</form:form>
		
		<form:errors path="userObj"></form:errors>
	</center>
</body>
</html>