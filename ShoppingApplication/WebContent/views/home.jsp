<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.manthan.shoppingapplication.bean.UserInfoBean"%>
<%@page import="com.manthan.shoppingapplication.bean.OrderInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%
	UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");
  	String orderMsg=(String)request.getAttribute("orderMsg");
  	List<OrderInfoBean> orderInfoBeans=(ArrayList)request.getAttribute("orderHistory");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello <%=userInfoBean.getUserName() %></h1>
	<a href="./searchProduct">SEARCH PRODUCT</a>
	<br>
	<br>
	<a href="./orderProduct">ORDER PRODUCT</a>
	<br>
	<br>
	<a href="./OrderHistoryServlet">ORDER HISTORY</a>
	<br>
	<br>
	<a href="./LogoutServlet">LOGOUT</a>
	<br>
	<br>
<p><%if(orderMsg!=null){ %><%=orderMsg %><%} %></p>
<p>The Ordered Products are:</p>
<%=orderInfoBeans %>

</body>
</html>