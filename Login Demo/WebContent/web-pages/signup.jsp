<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Signup page!</title>
</head>
<body background="iiitb.jpg">
<div class="container">
<div class="col-sm-4"></div>

<div class="col-sm-4">
<div class="well">
<form method="post" action="/Login_Demo/servlet1">
	<div class="jumbotron">
	<h5>New user ? Register here!!</h5>
	</div>	
	<table class=" table table-bordered">
		<tr><td>FirstName:</td><td><input type="text" name="fname"></td></tr>
		<tr><td>LastName:</td><td><input type="text" name="lname"></td></tr>
		<tr><td>UserName:</td><td><input type="text" name="uname"></td></tr>
		<tr><td>Password:</td><td><input type="password" name="pwd1"></td></tr>
		<tr><td>Re-enter Password:</td><td><input type="password" name="pwd2"></td></tr>
		<tr><td>phone:</td><td><input type="text" name="mob"></td></tr>
		<tr><td>Email-id:</td><td><input type="email" name="emailid"></td></tr>
		<tr><td>Address:</td><td><textarea name="address"></textarea></td></tr>		
	</table>
	<br>
	<input type="submit" name="signup"/>
</form>
<a href="login.jsp"><button>login</button></a>
</div>
</div>
</div>
	
	
</body>
</html>