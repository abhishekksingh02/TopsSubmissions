<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<style type="text/css">
body {
    margin: 0;
    padding: 0;
    overflow-x: hidden;
    box-sizing: border-box;
}

#fashion-content {
    width: 100%;
    height: auto;
    margin-top: 1%;
}

.login-items {
    width: 80%;
    height: auto;
    margin: auto;
    margin-top: 1%;
}

.login-header {
    border: outset 1px lightgray;
    padding: 10px;
    border-bottom: solid 8px lightgray;
}

.login-header input {
    padding-left: 25px;
}

.login-body {
    border: outset 1px lightgray;
    padding: 10px;
    display: flex;
    flex-direction: row;
}

.login-content img {
    width: 80%;
    height: 80%;
    padding: 35px;
    margin-left: 15%;
}

.login-form {
    width: 50%;
    height: auto;
    padding: 25px;
}

.login-form input[type="text"],
.login-form input[type="password"],
.login-form select,
.login-form textarea {
    width: 300px;
    height: auto;
    padding: 10px;
}

.login-form select {
    width: 300px;
    height: auto;
    padding: 10px;
}

.login-form input[type="submit"],
.login-form input[type="reset"] {
    width: 150px;
    height: auto;
    padding: 10px;
    background-color: #07be94;
    border: 1px solid #07be94;
    border-radius: 8px;
    color: white;
}

.login-form input[type="submit"]:hover,
.login-form input[type="reset"]:hover {
    background-color: #596261;
    transition: .7s;
}
</style>

<script type="text/javascript">
function validateForm() {
    var name = document.forms["registrationForm"]["name"].value;
    var surname = document.forms["registrationForm"]["surname"].value;
    var phone = document.forms["registrationForm"]["phone"].value;
    var email = document.forms["registrationForm"]["email"].value;
    var gender = document.forms["registrationForm"]["gender"].value;
    var pwd = document.forms["registrationForm"]["pwd"].value;
    var cpwd = document.forms["registrationForm"]["cpwd"].value;
    
    if (name === "" || surname === "" || phone === "" || email === "" || gender === "" || pwd === "" || cpwd === "") {
        alert('All Fields are mandatory!!');
        return false;
    }
    
    if (!isAlphabet(name)) {
        alert('Please Enter a Valid Name!!');
        return false;
    }
    
    if (!isAlphabet(surname)) {
        alert('Please Enter a Valid Surname!!');
        return false;
    }
    
    if (!isNumeric(phone)) {
        alert('Please Enter a valid Mobile Number!!');
        return false;
    }
    
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
    var alphaExp = /^[a-zA-Z]+$/;
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

<jsp:include page="header.jsp"></jsp:include> 
<section id="fashion-content">
    <div class="login-items">
        <div class="login-header">
            <h5>Register as new user</h5>
            <span>Fields with * are mandatory Fields.</span>
        </div>
        
        <div class="login-body">
            <div class="login-content">
                <img src="https://media.tenor.com/p0G_bmA2vSYAAAAd/login.gif" alt="Login Image">
            </div>
            <div class="login-form">
                <form name="registrationForm" action="signup.jsp" method="get" onsubmit="return validateForm()">
                    <input type="text" name="name" id="name" placeholder="Name*" required>
                    <br>
                    <span>Eg. Suresh (Do not use Numeric Values)</span>
                    <br><br>
                    
                    <input type="text" name="surname" placeholder="Surname*" id="surname" required>
                    <br>
                    <span>Eg. Singh (Do not use Numeric Values)</span>
                    <br><br>
                    
                    <input type="text" name="phone" placeholder="Phone No*" id="phone" maxlength="10" required>
                    <br><br>
                    
                    <input type="text" name="email" placeholder="Email*" id="email" required>
                    <br><br>
                    
                    <select name="gender" placeholder="Gender" required>
                        <option value="0">Select-Gender*</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select>
                    <br><br>
                    
                    <input type="password" name="pwd" placeholder="Password*" id="pwd" required>
                    <br><br>
                    
                    <input type="password" name="cpwd" placeholder="Confirm Password*" id="cpwd" required>
                    <br><br>
                    
                    <input type="submit" name="submit" value="Register">
                    <input type="reset" name="reset" value="Reset">
                    
                    <br><br>
                    &nbsp;<b>Already have an account? <a href="login.jsp">Login</a></b>
                    <br>
                </form>
            </div>
        </div>
    </div>
</section> 
</body>
</html>
