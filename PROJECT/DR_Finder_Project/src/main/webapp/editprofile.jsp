<%@page import="com.dao.dao"%>
<%@page import="com.model.model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One Health: Edit Profile</title>

<style type="text/css">


body 
{
    margin: 0;
    padding: 0;
    overflow-x: hidden;
    box-sizing: border-box; 
    
}

#fashion-content
{
    width: 100%;
    height: auto;
    margin-top: 1%;
}
.login-items
{
    width: 80%;
    height: auto;
    margin: auto;
    margin-top: 1%;
}
.login-header
{
    border: outset 1px lightgray;
    padding: 10px;
    border-bottom: solid 8px lightgray;
}
.login-header input
{
	padding-left: 25px;

}
.login-body 
{
    border: outset 1px lightgray;
    padding: 10px;
    display: flex;
    flex-direction: row;
}
.login-content img
{
    width: 80%;
    height: 80%;
    padding: 35px;
    margin-left: 15%;

}
.login-form
{
    width: 50%;
    height: auto;
    padding: 25px;
}
.login-form input[type="text"],input[type="password"],select,textarea
{
    width: 300px;
    height: auto;
    padding: 10px;
}
.login-form select
{
    width: 300px;
    height: auto;
    padding: 10px;
}
.login-form input[type="submit"]
{
    width: 150px;
    height: auto;
    padding: 10px;
    background-color: #07be94;
    border: 1px solid #07be94;
    border-radius: 8px;
    color: white;
}
.login-form input[type="submit"]:hover{
    background-color: #596261;
    transition:.7s;
}
.login-form input[type="reset"]
{
    width: 150px;
    height: auto;
    padding: 10px;
    border: none;
    background-color: red;
    color: white;
}
</style>

<script type="text/javascript">
function isAlphabet(elem, helperMsg)
{
	var alphaExp = /^[a-zA-Z]+$/;
	if(elem.value.match(alphaExp))
		{
		  return true;
		}
	else
		{
	       alert(helperMsg);
		   return false;
		}
	}
</script>
</head>
<body>

<%
  	String email = request.getParameter("email");
	model m = dao.getdetailbyemail(email);

%>

<jsp:include page="header.jsp"></jsp:include>
	<section id="fashion-content">
        <div class="login-items">
            <div class="login-header"><h5>Edit Profile.</h5>
            
            </div>
            
            <div class="login-body">
               <div class="login-content">
                <img src="https://media.tenor.com/p0G_bmA2vSYAAAAd/login.gif">
               </div>
               <div class="login-form">
                <form action="editprofile2.jsp">
                	
                	 <input type="hidden" name="id" placeholder="ID" id="id" value="<%=m.getId() %>" onblur = "isAlphabet(document.getElementById('name'), 'Letters only please')" required>
                    <br><br>
                	
                    <input type="text" name="name" placeholder="Name*" id="name" value="<%=m.getName() %>" onblur = "isAlphabet(document.getElementById('name'), 'Letters only please')" required>
                    <br><br>
                    
                    <input type="text" name="surname" placeholder="Surname*" id="surname" value="<%=m.getSurname() %>" required>
                    <br><br>
                    
                     <input type="text" name="phone" placeholder="Phone No*" id="phone" value="<%=m.getPhone()%>" required>
                    <br><br>
                    
                    <input type="text" name="email" placeholder="Email*" id="email" value="<%=m.getEmail() %>" required>
                    <br><br>
                    
                    <select  name="gender" placeholder="Gender" required>
                    <option value=" <%=m.getGender() %> "><%=m.getGender() %></option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    </select>
                    <br><br>
                   
                    
                    
                    <input type="submit" name="submit" value="Submit">
                    
                   
                    
                    <br><br>
                    
                  
                </form>
               </div>
            </div>
        </div>
    </section> 
    <br>
    <br> 
<jsp:include page="footer.jsp"></jsp:include>





</body>
</html>