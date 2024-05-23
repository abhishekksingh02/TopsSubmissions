<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>::One Health-Queries::</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">

.flx {
    display: flex;
}
.sidebar {
    width: 20%;
    height: 100vh;
    background-color: #333;
    color: #fff;
    overflow-y: auto;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}
.sidebar h2 {
    padding: 5px 20px;
    margin: 0;
    text-align: center;
    letter-spacing: 1px;
}
.sidebar ul {
    list-style-type: none;
    padding: 0;
    margin: 5px 0;
}
.sidebar ul li {
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}
.sidebar ul li:hover {
    background-color: #555;
}
a {
    text-decoration: none;
    color: white;
}
a:hover {
    color: white;
    text-decoration: none;
}
</style>
</head>
<body>
<%
    response.setHeader("cache-control", "no-cache");
    response.setHeader("cache-control", "no-store");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>

<%
    if (session.getAttribute("adminsession") == null) {
        response.sendRedirect("adminLogin.jsp");
    } else {
%>

<div class="flx">

    <div class="sidebar">
        <div style="margin-top: 5px">
            <h2>One Health</h2>
            <h2>Admin Panel</h2>
        </div>
        <ul>
            <li><a href="index.jsp">Dashboard</a></li>
            <li><a href="addDoc.jsp">Add Doctors/View Doctors</a></li>
            <li><a href="#">Add Nurses/View Nurses</a></li>
            <li><a href="#">View Appointments</a></li>
            <li><a href="viewQueries.jsp">View Queries</a></li>
            <li><a href="logOut.jsp" style="color: red; font-weight: 600;">Logout</a></li> <!-- Added logout page -->
        </ul>
    </div>

    <div class="tbl" style="width: 80%">
        <h1 style="text-align: center;">Queries Table</h1>
        <table class="table">
            <tr>
                <th>User ID</th>
                <th>Fullname</th>
                <th>Email</th>
                <th>Subject</th>
                <th>Message</th>
            </tr>
            <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/doctor_finder" user="root" password="" var="ds"></sql:setDataSource>
            <sql:query dataSource="${ds}" var="rs"> SELECT * FROM contacteduser</sql:query>
            <c:forEach items="${rs.rows}" var="row">
                <tr>
                    <td><c:out value="${row.id}"/></td>
                    <td><c:out value="${row.fullname}"/></td>
                    <td><c:out value="${row.email}"/></td>
                    <td><c:out value="${row.subject}"/></td>
                    <td><c:out value="${row.message}"/></td>
                </tr>
            </c:forEach>
        </table>
    </div>

<%
    }
%>

</div>
</body>
</html>
