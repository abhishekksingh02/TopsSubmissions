<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Module4Q5</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
       <center><h1>List of Users are:</h1></center>
       <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/module4" user="root" password="" var="ds"></sql:setDataSource>
       
       <sql:query dataSource="${ds}" var="rs" > select * from module4q5 </sql:query>
       
       <table class="table">
       
           <tr>
             <td>User ID</td>
             <td>User Name</td>
             <td>User Email</td>
             <td>User password</td>
           </tr>
           
           <c:forEach items="${rs.rows}" var="row" >
             <tr>
               <td><c:out value="${row.id}"></c:out></td>
               <td><c:out value="${row.name}"></c:out></td>
               <td><c:out value="${row.email}"></c:out></td>
               <td><c:out value="${row.pass}"></c:out></td>
             
             </tr>
           </c:forEach>
       
       </table>
</body>
</html>