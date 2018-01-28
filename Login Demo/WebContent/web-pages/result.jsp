<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="newPackage.Subject" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Result</title>
</head>
<body background="iiitb.jpg">
<br>
<% Subject subject=(Subject) session.getAttribute("subject"); 
					String name=subject.getUname();
%>
<center>
<div class="container">
<div class="col-sm-4"></div>
<div class="col-sm-4">
<form method="post" action="/Login_Demo/servlet1">
	<div class="well">
	<h2>Welcome <%=subject.getUname() %> !!</h2>

	<img alt="test" src="<%=subject.getImage()%>" width="200" height="200">
	
	<table class=" table table-bordered table-hover table-striped">
		<tr><td>Name :</td><td><%=subject.getUname()%></td></tr>
		<tr><td>Roll No:</td><td><%=subject.getRollNo() %></td></tr>
		<tr><td>OOAD :</td><td><%=subject.getOoad() %></td></tr>
		<tr><td>DM :</td><td><%=subject.getDm() %></td></tr>
		<tr><td>OS :</td><td><%=subject.getOs() %></td></tr>
		<tr><td>CN :</td><td><%=subject.getCn()%></td></tr>
		<tr><td>OS :</td><td><%=subject.getOs() %></td></tr>
				
	</table></div>	
	<br>
	<input type="submit" name="Close" value="Close"/>
</form>
</div>
</center>

</body>
</html>ml>