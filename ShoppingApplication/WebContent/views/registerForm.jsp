<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String registeredMsg=(String) request.getAttribute("registeredMsg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(registeredMsg!=null){ %>
<div>
	<p style="color: red"><%=registeredMsg %></p>
</div>
<%} %>
<form action="./RegisterServlet" method="post">
		<table>
			<tr>
				<td>User ID:</td>
				<td><input type="number" name="userId" required></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="userName" required></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="REGISTER"></td>
			</tr>
		</table>

	</form>
</body>
</html>