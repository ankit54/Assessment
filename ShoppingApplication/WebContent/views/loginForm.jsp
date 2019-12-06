<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String invalidMessage=(String) request.getAttribute("invalidMessage");
    	String registeredMsg=(String) request.getAttribute("registeredMsg");
    	String loginMsg=(String) request.getAttribute("loginMsg");
    	String logoutMsg=(String) request.getAttribute("logoutMsg");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><%if(invalidMessage!=null){ %><%=invalidMessage %><%} %></p>
<p><%if(registeredMsg!=null){ %><%=registeredMsg %><%} %></p>
<p><%if(loginMsg!=null){ %><%=loginMsg %><%} %></p>
<p><%if(logoutMsg!=null){ %><%=logoutMsg %><%} %></p>
<form action="./LoginServlet" method="post">
<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="userName" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
</table>
			<tr>
				<td><input type="submit" value="LOGIN"></td>
			</tr>
</form>
</body>
</html>