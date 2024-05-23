<%@page import="com.model.model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <link rel="stylesheet" href="assets/css/maicons.css">-->

  <link rel="stylesheet" href="assets/css/maicons.css">

  <link rel="stylesheet" href="assets/css/bootstrap.css">

  <link rel="stylesheet" href="assets/vendor/owl-carousel/css/owl.carousel.css">

  <link rel="stylesheet" href="assets/vendor/animate/animate.css">

  <link rel="stylesheet" href="assets/css/theme.css">
  <style>
  		.navbar .navbar-nav .nav-item{		
  			color : rgba(110, 128, 122, 0.8) !important;
  		}
  		.navbar .navbar-nav .nav-item.color{
  			color : #00D9A5 !important;
  		}
  		li a:hover{
  		     color: #00D9A5 !important;
  		     transition: 2s !important;
  		}
  		
  		
  </style>
</head>
<body>
 <header>
    <div class="topbar">
      <div class="container">
        <div class="row">
          <div class="col-sm-8 text-sm">
            <div class="site-info">
              <a href="#"><span class="mai-call text-primary"></span> +91 8160509056</a>
              <span class="divider">|</span>
              <a href="#"><span class="mai-mail text-primary"></span> onehealth@gmail.com</a>
            </div>
          </div>
          <!--  <div class="col-sm-4 text-right text-sm">
            <div class="social-mini-button">
              <a href="#"><span class="mai-logo-facebook-f"></span></a>
              <a href="#"><span class="mai-logo-twitter"></span></a>
              <a href="#"><span class="mai-logo-dribbble"></span></a>
              <a href="#"><span class="mai-logo-instagram"></span></a>
            </div>
          </div>-->
        </div> <!-- .row -->
      </div> <!-- .container -->
    </div> <!-- .topbar -->

    <nav class="navbar navbar-expand-lg navbar-light shadow-sm">
      <div class="container">
        <a class="navbar-brand" href="index.jsp"><span class="text-primary">One</span>-Health</a>

        <form action="#">
          <div class="input-group input-navbar">
            <div class="input-group-prepend">
              <span class="input-group-text" id="icon-addon1"><span class="mai-search"></span></span>
            </div>
            <input type="text" class="form-control" placeholder="Enter keyword.." aria-label="Username" aria-describedby="icon-addon1">
          </div>
        </form>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupport" aria-controls="navbarSupport" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupport">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link " href="index.jsp">Home</a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="about.jsp">About Us</a>
            </li>
            
            
            <%
            	
            	if(session.getAttribute("session")!=null)
            	{
            		
            	
            
            %>
            
           <li class="nav-item">
              <a class="nav-link" href="doctors.jsp">Doctors</a>
            </li>
            
            
          
            
            <%
            
            	}
            %>
            
              <li class="nav-item">
              <a class="nav-link" href="contact.jsp">Contact</a>
            </li>
            
            <li class="nav-item">
              <a class="nav-link" href="blog.jsp">News</a>
            </li>
            
            
             <li class="nav-item">
				<%
				     if(session.getAttribute("user")!= null)
				     {
				%>
				    <a class = "btn btn-primary ml-lg-3" href= "logout.jsp">Logout</a>
				 
				  <%
				     }
				     else
				     {
				  %>
				      <a class = "btn btn-primary ml-lg-3" href= "login.jsp">Login / Register</a>
				      
				   <%
				     }
					   
				   %>

             </li>
             
              <li class="nav-item">
				<%
				     if(session.getAttribute("user")!= null)
				     {   
				    	 model m = new model();
				    	 
				    	 String email = (String)session.getAttribute("myemail");
				%>
				 
				    	<div style="margin-left: 10px ; background-color: #00D9A5 ; color: white;border-radius: 10px;"  >
                        			<a href="editprofile.jsp?email=<%=email%>" title="Edit profile">  <img src="assets/img/profile_img.png" width="50px" height="50px"></a>
                        </div>			 
				  <%
				     }
				     
					   
				   %>

             </li>
 </ul>
        </div> <!-- .navbar-collapse -->
      </div> <!-- .container -->
    </nav>
  </header>
  
  <script src="assets/js/jquery-3.5.1.min.js"></script>

<script src="assets/js/bootstrap.bundle.min.js"></script>

<script src="assets/vendor/owl-carousel/js/owl.carousel.min.js"></script>

<script src="assets/vendor/wow/wow.min.js"></script>

<script src="assets/js/theme.js"></script>
	<script>
	let active = document.querySelectorAll('.nav-link');
	console.log(active[0])
	if(active[0].hasClass)
	</script>
	
</body>
</html>