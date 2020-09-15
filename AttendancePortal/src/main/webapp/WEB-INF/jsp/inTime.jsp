
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form"	uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mark Attendance</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
			
			
			<c:if test="${reportBean.getInTime() == null && reportBean.getDate() == null}">
			<br>
			<br>
			<h3>${message}</h3>
			<br>
			
			</c:if>
			<c:if test="${reportBean.getInTime() != null && reportBean.getDate() != null }">
			
			<br>
			<br>
			
			<br>
			<br>
			<br>
			<form:form action="addOutTimeAndActivity" modelAttribute="reportBean" method="POST">
			<form:label path="activity">Enter today's activity</form:label>
			<form:textarea path="activity" rows="5" cols= "30"/>
			<input type="submit" value="Submit">
			<h3>${message}</h3>
			</form:form>
			</c:if>
					
			<br />
			<a href="index.html"> Home</a>
		</center>
</body>
</html>