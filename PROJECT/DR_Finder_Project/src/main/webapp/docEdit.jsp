<%@page import="com.admindao.AdminDao"%>
<%@page import="com.adminModel.docModel"%>
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
            docModel m2 = AdminDao.editData(m.getId());
            
            if(m2 != null)
            {
            	response.sendRedirect("addDoc.jsp");
            }
            else
            {
            	out.print("Failed to Edit Doctor Data!!");
            }
            
           
        %>
</body>
</html>
