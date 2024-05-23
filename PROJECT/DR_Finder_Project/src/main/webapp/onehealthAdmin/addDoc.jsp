<%@page import="com.adminModel.docModel"%>
<%@page import="com.model.model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>

<!-- Bootstrap cdn -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>::One Health-Doctor Editing::</title>

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

.edit{
color: black;
}

.delete{
	color: #F44336;
	margin-left: 15px;
	
	
}
.delete:hover
{
   color: #F44336;
}
.edit:hover{
   color:black;
}

.btn {
	color: #fff;
	float: right;
	font-size: 13px;
	border: none;
	min-width: 50px;
	border-radius: 5px;
	border: none;
	outline: none !important;
	margin-left: 10px;
	margin-top:10px;
	margin-bottom:10px;
	margin-right:10px
}

 .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
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
        <h1 style="padding-left:10px; display:inline-block;">Manage <span style="font-weight:bold;">Doctors</span></h1>
        <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Doctor</span></a>
						<a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>
        <table class="table">
            <tr>
                <th>Doc ID</th>
                <th>Doc Name</th>
                <th>Speciality</th>
                <th>Experience</th>
                <th>Edu. Background</th>
                <th>Actions</th>
            </tr>
            <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/doctor_finder" user="root" password="" var="ds"></sql:setDataSource>
            <sql:query dataSource="${ds}" var="rs"> SELECT * FROM doctors </sql:query>
            <c:forEach items="${rs.rows}" var="row">
                <tr>
                    <td><c:out value="${row.id}"/></td>
                    <td><c:out value="${row.name}"/></td>
                    <td><c:out value="${row.speciality}"/></td>
                    <td><c:out value="${row.experience}"/></td>
                    <td><c:out value="${row.edu_bkg}"/></td>
                    <td>
							
							
							<td><a href="edit.jsp?id=${row.id}" class="edit" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a></td><td>
							<a href="delete.jsp?id=${row.id}" class="delete" ><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a></td>
							
							<%-- <a href="#editEmployeeModal" class="edit" data-toggle="modal" value="<%=%>"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
							<a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a> --%>
						</td>
                </tr>
            </c:forEach>
            
            <!-- Edit Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="docInsert.jsp" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Add Doctor</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					<div class="form-group">
						<label>Name</label>
						<input type="text" name="name" class="form-control" required>
					</div>
					<div class="form-group">
						<label>Speciality</label>
						<input type="text" name="speciality" class="form-control" required>
					</div>
					<div class="form-group">
						<label>Experience</label>
						<textarea name="experience" class="form-control" required></textarea>
					</div>
					<div class="form-group">
						<label>Education Background</label>
						<input type="text" name="edu_bkg"class="form-control" required>
					</div>					
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-success" value="Add">
				</div>
			</form>
		</div>
	</div>
</div>
            
            
            <!-- Edit Modal HTML -->
<div id="editEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="docUpdate.jsp" method ="post">
				<div class="modal-header">						
					<h4 class="modal-title">Edit Doctor</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					<div class="form-group">
						<label>Name</label>
						<input type="text" name="name" class="form-control" required>
					</div>
					<div class="form-group">
						<label>Speciality</label>
						<input type="text" name="speciality" class="form-control" required>
					</div>
					<div class="form-group">
						<label>Experience</label>
						<textarea class="form-control" name="experience" required></textarea>
					</div>
					<div class="form-group">
						<label>Education Background</label>
						<input type="text" class="form-control"  name ="edu_bkg"required>
					</div>					
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-info" value="Save">
				</div>
			</form>
		</div>
	</div>
</div>
            <!-- Delete Modal HTML -->
<div id="deleteEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="dltDoc.jsp" method = "post">
				<div class="modal-header">						
					<h4 class="modal-title">Delete Doctor</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					<p>Are you sure you want to delete these Records?</p>
					<p class="text-warning"><small>This action cannot be undone.</small></p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-danger" value="Delete">
				</div>
			</form>
		</div>
	</div>
</div>
            
        </table>
    </div>

<%
    }
%>

</div>
</body>
</html>
