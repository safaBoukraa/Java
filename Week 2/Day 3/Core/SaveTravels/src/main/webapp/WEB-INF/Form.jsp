<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
</head>
<body>
	<h1>Save Travels</h1>
	<table class="table" >
    <thead>
      <tr>
        <th scope="col">Expense</th>
        <th scope="col">Vendor</th>
        <th scope="col">Amount</th>
        <th scope="col">Action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${allTravels }" var="oneTravel">
     
				<tr>
					<td><a href="/travels/${oneTravel.id}">${oneTravel.expense}</a></td>
					<td>${oneTravel.vendor}</td>
					<td>${oneTravel.amount}</td>
					<td><a href="/travels/edit/${oneTravel.id }">Edit</a>
					<form action="/${oneTravel.id}" method="post">
					<input type="hidden" name="_method" value="delete"> 
					<input type="submit" value="Delete">
					</form></td>
				</tr>
		</c:forEach>
		

		
    </tbody>
  </table>
	<h2 class="container text-danger">Add Travel</h2>
    <form:form action="/travel/processForm" method= "POST" class="container" modelAttribute="travel">
   <p class="form-group">
            <form:label path="expense">expense</form:label>
            <form:errors path="expense"/>
            <form:input path="expense" class="form-control"/>
        </p>
    <p class="form-group">
        <form:label path="vendor">vendor</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor" class="form-control"/>
    </p>
    <p class="form-group">
        <form:label path="amount">amount</form:label>
        <form:errors path="amount"/>     
        <form:input type="number" path="amount" class="form-control"/>
    </p>
     <p class="form-group">
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description" class="form-control"/>
    </p> 
    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>    
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>