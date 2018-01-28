<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="newPackage.User" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>s
<title>Welcome</title>
</head>
<body background="iiitb.jpg">
<br>
<% User user=(User) session.getAttribute("user"); 
					String name=user.getFname();
%>
<center>
<div class="container">
<div class="col-sm-4"></div>
<div class="col-sm-4">
<form method="post" action="/Login_Demo/servlet1">
	<div class="well">
	<h2>Welcome <%=user.getFname() %> !!</h2>
	
	<table class=" table table-bordered table-hover table-striped">
		<tr><td>FirstName :</td><td><%=user.getFname() %></td></tr>
		<tr><td>LastName :</td><td><%=user.getLname() %></td></tr>
		<tr><td>UserName :</td><td><%=user.getUname() %></td></tr>
		<tr><td>phone :</td><td><%=user.getMob()%></td></tr>
		<tr><td>Email-id :</td><td><%=user.getEmailid() %></td></tr>
		<tr><td>Address :</td><td><%=user.getAddress()%></td></tr>		
	</table></div>	
	<br>
	<input type="submit" name="viewGrade" value="View Result"/>
</form>
</div>
</center>

</body>
</html>