<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Registration </title>
    <link rel="stylesheet" href="style.css">
    <script type="text/javascript">
	function validateForm() {
    var name = document.forms["registrationForm"]["name"].value;
    var email = document.forms["registrationForm"]["email"].value;
    var pwd = document.forms["registrationForm"]["pwd"].value;
    var cpwd = document.forms["registrationForm"]["cpwd"].value;
    
    if (name === "" || email === "" || pwd === "" || cpwd === "") {
        alert('All Fields are mandatory!!');
        return false;
    }. 
    
    if (!isAlphabet(name)) {
        alert('Please Enter a Valid Name!!');
        return false;
    }
    
   /*  if (!isAlphabet(surname)) {
        alert('Please Enter a Valid Surname!!');
        return false;
    } */
    
    /* if (!isNumeric(phone)) {
        alert('Please Enter a valid Mobile Number!!');
        return false;
    } */
    
    if (!lengthRestriction(pwd, 1, 10)) {
        alert('Password length must be between 1 and 10 characters!!');
        return false;
    }
    
    if (pwd !== cpwd) {
        alert('Password and Confirm Password do not match!!');
        return false;
    }
    
    return true;
}

function isAlphabet(elem) {
	    var alphaExp = /^[a-zA-Z\s]+$/;
	    return elem.match(alphaExp);
	}

function isNumeric(elem) {
    var numericExp = /^[0-9]+$/;
    return elem.match(numericExp);
}

function lengthRestriction(elem, min, max) {
    var uInput = elem.length;
    return (uInput >= min && uInput <= max);
}
</script>
   </head>
<body>

<%

	


%>
  <div class="wrapper">
    <h2>Registration</h2>
    <form name="registrationForm" action="otpgenerator.jsp" method="get" onsubmit="return validateForm()">
      <div class="input-box">
        <input type="text" name="name" placeholder="Enter your name" required>
      </div>
      <div class="input-box">
        <input type="text" name="email" placeholder="Enter your email" required>
      </div>
      <div class="input-box">
        <input type="password" name="pwd" placeholder="Create password" id="pwd" required>
      </div>
      <div class="input-box">
        <input type="password" name="cpwd" placeholder="Confirm password" id="cpwd" required>
      </div>
      <div class="policy">
        <input required type="checkbox">
        <h3>I accept all terms & condition</h3>
      </div>
      <div class="input-box button">
        <input type="Submit" value="Register Now">
      </div>
      <div class="text">
        <h3>Already have an account? <a href="login.jsp">Login now</a></h3>
      </div>
    </form>
  </div>

</body>
</html>
