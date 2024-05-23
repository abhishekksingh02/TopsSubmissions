<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>::One Health-Admin Login::</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f1f1f1;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .login-container {
      background-color: #fff;
      width: 400px;
      padding: 40px;
      border-radius: 8px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }
    .login-container h2 {
      margin-bottom: 30px;
      text-align: center;
      color: #333;
    }
    .login-form input[type="text"],
    .login-form input[type="password"] {
      width: calc(100% - 20px);
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      outline: none;
    }
    .login-form input[type="submit"] {
      width: 100%;
      padding: 12px;
      background-color: #333;
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      outline: none;
      transition: background-color 0.3s ease;
    }
    .login-form input[type="submit"]:hover {
      background-color: #555;
    }
    .login-form p {
      margin-top: 15px;
      text-align: center;
    }
    .login-form p a {
      color: #333;
      text-decoration: none;
      font-weight: bold;
    }
    .login-form p a:hover {
      text-decoration: underline;
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
  <div class="login-container">
    <h2>Login to One Health Admin Panel</h2>
    <form class="login-form" action="LoginCheck.jsp" method="post">
      <input type="text" name="uname" placeholder="Username" required>
      <input type="password" name="pass" placeholder="Password" required>
      <input type="submit" value="Login">
    </form>
  </div>
</body>
</html>
