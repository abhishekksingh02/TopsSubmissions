 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

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
.login-form input[type="text"], .login-form input[type="password"], .login-form select, .login-form textarea
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
    border: none;
    border-radius: 8px;
    background-color: #00D9A5;
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
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
    <section id="fashion-content">
        <div class="login-items">
            <div class="login-header"><h5>Login</h5>
            </div>
            <div class="login-body">
               <div class="login-content">
                <img src="https://media.tenor.com/p0G_bmA2vSYAAAAd/login.gif">
               </div>
               <div class="login-form">
               <form action="signin.jsp">
               <br><br><br><br>
                 <input type="text" name="email" placeholder="Email*" required>
                    <br><br>
                    <input type="password" name="pwd" placeholder="Password*" required>
                    <br><br>
                    <input type="submit" name="login" value="Login">
                    <br><br>
                    &nbsp;<b>New User?<a href="register.jsp">Register</a></b>
                    <br>
                </form>
               </div>
            </div>
        </div>
    </section> 
    <br>
    <br> 
</body>
</html>
