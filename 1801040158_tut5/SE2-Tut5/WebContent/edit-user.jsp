
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="model.User" %>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%-- TO-DO: Include navigation bar (nav-bar.jsp)  --%>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<%-- TO-DO: CREATE A FORM FOR UPDATING USER --%>
	<!-- get user from servlet -->
	<% User user = (User) request.getAttribute("edit-user"); %>
	<div style="width:75%">
	<form action="update" method="post">
		<div class="form-group">
	   	 	<label for="id">ID</label>
	    	<input type="text" class="form-control" id="id"  name="id"  value="<%=user.getId() %>" readonly="readonly">
	    	
	  	</div>
		<div class="form-group">
	   	 	<label for="name">Full name</label>
	    	<input type="text" class="form-control" id="name" value="<%=user.getName() %>"  name="name">
	    	
	  </div>
	  <div class="form-group">
	    <label for="address">Address</label>
	    <input type="text" class="form-control" id="address" value="<%=user.getAddress() %>" name="address">
	  </div>
	  
	  <div class="form-group">
	    <label for="mobile">Mobile</label>
	    <input type="text" class="form-control" id="mobile" value="<%=user.getMobile() %>" name="mobile">
	  </div>
	  
	  <button type="submit" class="btn btn-primary">Submit</button>
	
	</form>
	</div>
</body>
</html>
