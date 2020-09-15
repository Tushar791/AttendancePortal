
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
<div align="center">
			<br>
			<br>
			<c:if test="${not empty dailyReportList }">
			
			<table border="2">
			<tr>
				<th>Sl.no</th><th>Name</th><th>InTime</th><th>OutTime</th><th>Activity</th>
			</tr>
			<c:forEach items="${dailyReportList}" var="itr">
				<td><c:out value="${itr.slNo }"/></td>
				<td><c:out value="${itr.name }"/></td>
				<td><c:out value="${itr.inTime }"/></td>
				<td><c:out value="${itr.outTime }"/></td>
				<td><c:out value="${itr.activity }"/></td>
			</c:forEach> 
			<tr></tr>
			</table>
			
			</c:if>
			<c:if test="${empty dailyReportList }">
			
			
			</c:if>
			<br>
			<br>
			<br>
			<br />
			<a href="index.html"> Home</a>
</div>
</body>
</html>