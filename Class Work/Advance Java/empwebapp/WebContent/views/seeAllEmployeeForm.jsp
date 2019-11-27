<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBeans"%>
<%@page import="java.util.Iterator"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<EmployeeInfoBeans> ls=(ArrayList)request.getAttribute("seeEmployee"); %>
    <%String msg=(String)request.getAttribute("msg");%>
   <jsp:include page="/homePage"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
	<%if(ls!=null){ %>
	
	<table>
	<thead>All employees:</thead>
	<thead>
	<% Iterator<EmployeeInfoBeans> it=ls.iterator();
		while (it.hasNext()) {
			EmployeeInfoBeans bean =  it.next();%>
			<%=bean.getEmpName() %>
			<br>
		<%}%>
	</thead>
	</table>
	<%} %>
</body>
</html>