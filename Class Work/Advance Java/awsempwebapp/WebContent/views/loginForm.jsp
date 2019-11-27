<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% String msg=(String)request.getAttribute("invalidMessage");
String logoutMsg=(String)request.getAttribute("logoutMsg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(msg!=null) { %>
<%= msg %>
<% } %>
<h5 style="color: blue;">
<% if(logoutMsg!=null) { %>
<%= logoutMsg %>
<% } %>
</h5>
<fieldset>
<legend>Employee Login</legend>
<form action="./loginServletJsp" method="post">
		
			Id:<input type="number" name="empId"/><br> 
		Password:<input	type="password" name="empPassword"/><br> 
		
		<input type="submit" value="submit" />
	</form>
	</fieldset>
</body>
</html>