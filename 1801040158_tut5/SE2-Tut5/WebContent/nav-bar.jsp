<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%-- TO-DO: CREATE A NAVIGATION BAR WHICH INCLUDES HYPERLINK TO ADD & VIEW USER FORM --%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 
  
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="<%= request.getContextPath() %>/list">USER LIST</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<%= request.getContextPath() %>/new">ADD USER</a>
    </li>
    
  </ul>
</nav>

</body>
</html>