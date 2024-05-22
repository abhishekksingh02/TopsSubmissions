<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="wrapper">
    <h2>Login</h2>
    <form action="index.jsp">
        <div class="input-box">
            <input type="text" name="name" placeholder="Enter your name" required>
        </div>
        
        <div class="input-box">
            <input type="password" name="password" placeholder="Enter password" required>
        </div>
        
        <div class="policy">
            <input type="checkbox" required>
            <h3>I accept all terms & condition</h3>
        </div>
        <div class="input-box button">
            <input type="submit" value="Login">
        </div>
        <div class="text">
            <h3>New user? <a href="index.jsp">Register now</a></h3>
        </div>
    </form>
</div>
</body>
</html>
