<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<br>
		<h3 class="text-center">USER LIST</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Address</th>
					<th>Mobile</th>
				</tr>
			</thead>
			<tbody>
				<%-- c:forEach => basic iteration tag --%>
				<c:forEach var="user" items="${listUser}">
					<tr>
						<%-- c:out => for expressions --%>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.name}" /></td>
						<td><c:out value="${user.address}" /></td>
						<td><c:out value="${user.mobile}" /></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
