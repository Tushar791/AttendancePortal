<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="style.css">
    
</head>
<body>
	<form:form modelAttribute="userObj" method="POST"
			action="saveUser">
    <div class="container">
        <header>
            <a href="">
                <div class="logo">
                    <img src="images/beenhere-24px.svg" alt="" style="height: 5rem;width: 5rem">
                </div>
                <h1>Attendance Portal</h1>
        </a>
        </header>
        <main>
           <div class="entryTable">
               <table class="w3-table-all w3-card-4">
                   <tbody>
                       <tr>
                           <td>Name </td>
                           <td><form:input path="name" /></td>
                       </tr>
                       <tr>
                           <td>EnterpriseId </td>
                           <td><form:input path="enterpriseId" /></td>
                       </tr>
                       <tr>
                           <td>EmployeeId </td>
                           <td><form:input path="employeeId" /></td>
                       </tr>
                   </tbody>
               </table>
               <br>
               <input type="submit" class="button1" value="Submit">
           </div>
        </main>

    </div>
    </form:form>
    
</body>
</html>