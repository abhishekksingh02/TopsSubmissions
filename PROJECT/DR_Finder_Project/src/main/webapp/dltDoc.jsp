<%@ page import="com.admindao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.adminModel.docModel"/>
<jsp:setProperty property="*" name="m"/>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <%
              int rowsAffected = AdminDao.deleteData(m.getId());
              
              if(rowsAffected > 0)
              {
            	  response.sendRedirect("addDoc.jsp");
              }
              else
              {
            	  out.print("Failed to Delete Doctor Data!!"); 
              }
         %>
</body>
</html>
