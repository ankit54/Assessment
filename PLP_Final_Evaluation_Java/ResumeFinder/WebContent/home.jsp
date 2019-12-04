<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% List<String> result=(ArrayList) request.getAttribute("results");
	String message=(String) request.getAttribute("message");
	List<String> mails=(ArrayList) request.getAttribute("mails");
%>
<jsp:include page="search.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%if(message!=null){ %><%=message %>
	<%} %>
	<%if(result!=null && mails!=null){%>
	<table border>
		<tr>
			<th>File Name</th>
			<th>Email Id</th>
			<th>Click to Download</th>
		</tr>


		<%for(int i=0;i<result.size();i++){%>
		<tr>
			<td><%= result.get(i) %></td>
			<td><%= mails.get(i) %></td>
			<td><a href='./DownloadServlet?url=<%=result.get(i)%>'>Download</a></td>
		</tr>
		<%} %>

	</table>
	<%} %>
</body>
</html>