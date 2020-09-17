
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form"	uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <header>
            <a href="index.html">
                <div class="logo">
                    <img src="images/beenhere-24px.svg" alt="" style="height: 5rem;width: 5rem">
                </div>
                <h1>Attendance Portal</h1>
        </a>
        </header>
        <main>
            <div class="success">
            	<p>${message1}</p>
            	<br>
            	
                <p>${message}</p>
            </div>
            </div>
        </main>

    </div>
</body>
</html>