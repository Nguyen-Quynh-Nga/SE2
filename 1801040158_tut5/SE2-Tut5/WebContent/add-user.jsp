<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%-- TO-DO: Include navigation bar (nav-bar.jsp)  --%>
	<jsp:include page="nav-bar.jsp"/>

	<br>
	<%-- TO-DO: CREATE A FORM FOR ADDING USER --%>
	<h2>ADD USER</h2>
	<form action="insert" method="post">
	<div class="form-group">
      <label for="id">ID</label>
      <input type="id" class="form-control" id="id" >
    </div>
    <div class="form-group">
      <label for="name">Name</label>
      <input type="text" class="form-control" id="name" name ="name" >
    </div>
    <div class="form-group">
      <label for="address">Address</label>
      <input type="text" class="form-control" id="address" name ="address" >
    </div>
    <div class="form-group">
      <label for="mobile">Mobile</label>
      <input type="text" class="form-control" id="mobile" name = "mobile" >
    </div>
    
    
    <button type="add" class="btn btn-primary">ADD</button>
	
	
	</form>
	
</body>
</html>
