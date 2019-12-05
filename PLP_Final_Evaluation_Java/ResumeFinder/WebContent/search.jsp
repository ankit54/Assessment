<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<String> result=(ArrayList) request.getAttribute("results");
	//String message=(String) request.getAttribute("message");
	List<String> mails=(ArrayList) request.getAttribute("mails");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css">

<!-- Latest compiled JavaScript -->
<script src=https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>

<!-- jQuery library -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

<style type="text/css">
	
  
  .form-control::placeholder {
  font-size: 0.95rem;
  color: #aaa;
  font-style: italic;
	}
	
	.form-control:focus {
  box-shadow: none;
}
	
</style>
</head>
<body>

<div class="container-fluid">
<nav class="navbar navbar-light bg-light text-center">
  <h4 class="navbar-brand">WELCOME TO RESUME FINDER</h4>
</nav><br>
<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<h4 class="font-weight-bold text-center">Search Resume</h4><hr>
<form action="./SearchServlet" method="post">
          <div class="input-group mb-4">
            <input type="text" name="input" placeholder="What're you searching for?" aria-describedby="button-addon5" class="form-control" required>
            <div class="input-group-append">
              <button id="button-addon5" type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>
            </div>
          </div>
</form>
</div>
<div class="col-md-3 text-center" >
	<a href="./upload"><button type="button" class="btn btn-outline-primary btn-sm">Upload Resume</button></a>
</div>
</div> 

<div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">
<%if(result!=null && mails!=null){%>
	<table class="table table-hover table-bordered">
		<tr>
			<th scope="col">Sl. No.</th>
			<th scope="col">File Name</th>
			<th scope="col">Email Id</th>
			<th scope="col">Click to Download</th>
		</tr>

		<%for(int i=0;i<result.size();i++){%>
		<tr class="text-center">
			<td><%= i+1 %></td>
			<td><%= result.get(i) %></td>
			<td><%= mails.get(i) %></td>
			<td><a href='./DownloadServlet?url=<%=result.get(i)%>'><i class="fa fa-download fa-lg"></i></a></td>
		</tr>
		<%} %>

	</table>
	<%} %>
</div>
<div class="col-md-2"></div>
</div>
</div>
</body>
</html>