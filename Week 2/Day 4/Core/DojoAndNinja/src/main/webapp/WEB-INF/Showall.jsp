<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tacos</title>
<link rel="stylesheet" href="/css/main.css">
<!-- Adjust the path to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- Adjust the path to match your file/naming structure -->
</head>
<body>
	<h1>Burbank Location Ninjas</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Age</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneNinja" items="${allNinjas}">
				<tr>
					<td><a href="/ninjas/${oneNinja.id}">${oneNinja.firstName}</a></td>
					<td>${oneNinja.lasttName}</td>
					<td>${oneNinja.age}</td>
					<td>
						<form action="/ninjas/delete/ninja/${oneNinja.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

