<%@page import="com.manthan.shoppingapplication.bean.ProductInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String productMsg=(String) request.getAttribute("productMsg"); 
       ProductInfoBean productInfoBean=(ProductInfoBean) request.getAttribute("productInfoBean");
    %>
    <jsp:include page="/home"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./SearchProductServlet" method="post">
<table>
			<tr>
				<td>Product Name:</td>
				<td><input type="text" name="productName" required></td>
			</tr>
</table>
			<tr>
				<td><input type="submit" value="SEARCH PRODUCT"></td>
			</tr>
</form>
<p><% if(productMsg!=null){ %><%=productMsg %><%} %></p>
<p><% if(productInfoBean!=null){ %>
	Product ID:<%=productInfoBean.getProductId() %><br>
	Product Name:<%=productInfoBean.getProductName() %><br>
	Product Cost:<%=productInfoBean.getProductCost() %><br>
	Product Color:<%=productInfoBean.getProductColor() %><br>
	Product Description:<%=productInfoBean.getDescription() %><br>
	No.of quantity left:<%=productInfoBean.getNumberOfProducts() %><br>
	<%}%>
</p>
</body>
</html>