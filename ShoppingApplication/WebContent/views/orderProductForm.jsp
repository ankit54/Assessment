<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String orderMsg=(String) request.getAttribute("orderMsg"); %>
    <jsp:include page="/home"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./OrderProductServlet" method="post">
<table>
			<tr>
				<td>Product ID:</td>
				<td><input type="number" name="productId" required></td>
			</tr>
</table>
			<tr>
				<td><input type="submit" value="ORDER"></td>
			</tr>
</form>
<p><%if(orderMsg!=null){ %><%=orderMsg %><%} %></p>
</body>
</html>