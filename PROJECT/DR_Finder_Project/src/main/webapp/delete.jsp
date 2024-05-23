<%@page import="com.admindao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <%
		
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		AdminDao.deleteData(id2);
		response.sendRedirect("addDoc.jsp");
	
	%>
</body>
</html>