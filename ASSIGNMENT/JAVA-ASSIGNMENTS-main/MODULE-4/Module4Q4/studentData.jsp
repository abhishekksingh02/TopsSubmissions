<%@page import="myPackage.Model"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
	<h1>Student Data's</h1>
	<table border="1">

		<tr>

			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile No.</th>
			<th>Gender</th>
			<th>Password</th>

		</tr>

		<tr>
		
           <td><%=request.getAttribute("fname")%></td>
			<td><%=request.getAttribute("lname")%></td>
			<td><%=request.getAttribute("email")%></td>
			<td><%=request.getAttribute("mobile")%></td>
			<td><%=request.getAttribute("gender")%></td>
			<td><%=request.getAttribute("password")%></td>

		</tr>

	</table>
</body>
</html>