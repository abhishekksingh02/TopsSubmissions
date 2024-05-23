<%@page import="com.admindao.AdminDao"%>
<%@page import="com.adminModel.adminModel"%>
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
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

       	adminModel m = new adminModel();

        m.setUname(uname);
        m.setPass(pass);
         
        AdminDao a = new AdminDao();
        
        adminModel m2 = a.Login(m);
        
        //Once the user get logged out user will not be able to navigate back
        response.setHeader("cache-control", "no cache");
        response.setHeader("cache-control", "no-store");
        response.setHeader("pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        
        if(m2!=null)
        {
        	session.setAttribute("adminsession", true);
        	session.setAttribute("uname", m2.getUname());
        	session.setAttribute("pass", m2.getPass());
        	session.setAttribute("id", m2.getId());
        	
        	response.sendRedirect("index.jsp");
        }
        else
        {
    %>
            
            
          
                <b><p style= "color:red;font-family: sans-serif; font-size: 25px; position:absolute; top:0; margin-left:-4%; margin-top:4%"><br>Incorrect Username or Password! Please Try Again</p></b>
         

            
            
            <%@ include file="adminLogin.jsp" %>
    <%
    
    
        }
        
        
    %>
    
</body>
</html>
