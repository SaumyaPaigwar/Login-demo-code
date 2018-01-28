<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Login</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style type="text/css">
.background {
box-sizing: border-box;
width: 100%;
height: 150px;
padding: 3px;
border: 1px solid black;
background-size: 100% 100%;
}
</style>

</head>
<body background="iiitb.jpg">
	<div class="container" >
	<div class="col-sm-4"></div>
	<div class="col-sm-4">
	<br/><br/>
	<div class="well">
	<table class="table table-hover" >
	
	<form method="post" action="/Login_Demo/servlet1">
		<tr>
			<td> Username</td>
			<td> <input type="text" name="uname" /></td>
		</tr>	
	
		<tr>
			<td> Password</td>
			<td> <input type="password" name="pwd" /></td>
		</tr>	
			
		<tr>
			<td colspan="2"><input type="checkbox" name="remember" > Remember Me!!</input></td>
			
		</tr>
		
		<tr>
			<td> <input type="submit" name="login" value="Log in"></input></td></form>
			<td> <a href="signup.jsp"> <button name="signup1"> Sign up </button></a></td>
		</tr>
		
	</table>
	
	</div>
	</div>
	
	<div class="col-sm-4"></div>
	</div>
	
</body>
</html>
