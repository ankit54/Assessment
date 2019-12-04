<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String uploadMsg=(String) request.getAttribute("uploadMsg"); %>
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
</head>


<body>

<div class="container-fluid">
<nav class="navbar navbar-light bg-light text-center">
  <h4 class="navbar-brand">WELCOME TO RESUME FINDER</h4>
</nav><br>
<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
	<h3>File Upload:</h3><hr>
	      <form action = "./UploadServlet" method = "post" enctype = "multipart/form-data">
		      <div class="row">
		      <div class="col-md-8"><input type = "file" name = "file" size = "50" class="form-control"></div>
		      <div class="col-md-4"><button type="submit" value="Upload" class="btn btn-outline-primary btn-sm">Upload</button></div>
		      </div> 
	      </form>
	 <h3 style="color: green"><%if(uploadMsg!=null){ %><%=uploadMsg %><%} %></h3>
</div>
<div class="col-md-3">
	<a href="./search"><button type="button" class="btn btn-outline-primary btn-sm">Search Resume</button></a>
</div>
</div>
	
 </div> <!-- end of container-fluid -->
</body>

</html>