<%@page import="com.dao.dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="m" class="com.model.contactModel"/>
 <jsp:setProperty property="*" name="m"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error:/</title>
</head>
<body>
<% 
   int status = dao.contactinsertUser(m);
   if(status>0)
   {
	   response.sendRedirect("index.jsp");
   } else{
 %>
 <center>
 <b><p style="color:black; ;font-family: sans-serif; font-size: 25px;"><h1> Failed! Please Try Again</h1></p></b>
 </center>
 
<%@ include file="contact.jsp"%>
	<%		
        }
	%>
</body>
</html>