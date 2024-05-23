<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>::One Health-Admin Panel::</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f1f1f1;
    }
    .sidebar {
      width: 250px;
      height: 100%;
      background-color: #333;
      color: #fff;
      position: fixed;
      left: 0;
      top: 0;
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
    .content {
      margin-left: 250px;
      padding: 20px;
    }
    .content h2 {
      margin-top: 0;
      color: #333;
      text-transform: uppercase;
      font-size: 24px;
      letter-spacing: 1px;
    }
    .content p {
      color: #666;
      line-height: 1.6;
    }
    a
    {
       text-decoration: none;
       color: white;
    }
  </style>
</head>
<body>

  <%
    response.setHeader("cache-control", "no-cache");
	response.setHeader("cache-control", "no-store");
	response.setHeader("pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	
	
	
	 	if(session.getAttribute("adminsession")!=null)
	   	{
		 
	 		
	 		
	%>
	 
	 
	   <div class="sidebar">
  <div style="margin-top: 5px">
    <h2>One Health</h2>
    <h2>Admin Panel</h2>
    </div>
    <ul>
      <li><a href="">Dashboard</a></li>
      <li><a href="addDoc.jsp">Add Doctors/View Doctors</a></li>
      <li><a href="">Add Nurses/View Nurses</a></li>
      <li><a href="">View Appointments</a></li>
      <li><a href="viewQueries.jsp">View Queries</a></li>
      <li><a href="logOut.jsp" style="color: red; font-weight: 600;">Logout</a></li>
      
    </ul>
  </div>
  <div class="content">
    <center>
    <h1>Welcome to the Admin Panel</h1>
    </center>
    <h3>Welcome Back.</h3>
  </div>
	 
	 <% 		
	   	}
	 	else
	 	{
	 		response.sendRedirect("adminLogin.jsp");
	 	}
	
   %>
   
  
   
   


</body>
</html>
