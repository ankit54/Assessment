<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBeans"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<EmployeeInfoBeans> ls=(ArrayList)request.getAttribute("seeEmployee"); %>
    <%String msg=(String)request.getAttribute("msg");%>
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
	<tr>
	<td>All employees</td>
	<td>:</td>
	<td><%%></td>
	</tr><% Iterator<EmployeeInfoBeans> it=ls.iterator();
		while (it.hasNext()) {
			EmployeeInfoBeans bean =  it.next();%>
			<%=bean.getEmpName() %>
		
		<%}%>
	
	</table>
	<%} %>
</body>
</html>