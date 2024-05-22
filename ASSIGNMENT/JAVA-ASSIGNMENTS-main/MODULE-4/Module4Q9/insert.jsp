<%-- <%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.Model"></jsp:useBean>
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <% 
           int status = Dao.createdata(m);
           String password =  request.getParameter("pwd");
           String conpassword = request.getParameter("cpwd");
           
           if(password.equals(conpassword))
           {
        	if(status>0)
        	{
        		response.sendRedirect("index.jsp");
        	}
        	else
        	{
        		out.print("fail");
        	}
           }
           else
           {
        	   out.print("<h3>Password and confirm password mismatched!!</h3>");
           }
    %>
</body>
</html> --%>