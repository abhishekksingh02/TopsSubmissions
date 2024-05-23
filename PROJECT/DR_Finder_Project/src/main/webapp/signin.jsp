 <%@page import="com.dao.dao"%>
<%@page import="com.model.model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error:/</title>
</head>
<body>
   <%
         String email = request.getParameter("email");
         String password = request.getParameter("pwd");
         
         model m = new model();
         
         m.setEmail(email);
         m.setPwd(password);
         
         m = dao.login(m);
         
         if(m!= null)
         {
        	 // set-session
        	 
        	 session.setAttribute("session", true);
        	 session.setAttribute("user", email);
        	 session.setAttribute("myemail", email);
        	 session.setAttribute("myname", m.getName());
        	 session.setAttribute("mysurname", m.getSurname());
        	 session.setAttribute("myphone", m.getPhone());
        	 
        	 response.sendRedirect("index.jsp");
         }
         else
         {
        	 out.print("<h1>Incorrect Email or Password!!</h1>");
         }
  %>
</body>
</html>