<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
</head>
<body>
		<div>
		<form:form action="/register" method= "POST" class="container" modelAttribute="newUser">
  		<div class="form-group">
            <form:label path="userName">User name:</form:label>
            <form:errors path="userName"/>
            <form:input path="userName" class="form-control"/>
        </div>
        	<div class="form-group">
            <form:label path="email">Email:</form:label>
            <form:errors path="email"/>
            <form:input path="email" class="form-control"/>
        </div>
        	<div class="form-group">
            <form:label path="password">Password:</form:label>
            <form:errors path="password"/>
            <form:input path="password" type="password"  class="form-control"/>
        </div>
        	<div class="form-group">
            <form:label path="confirm">Confirm Password:</form:label>
            <form:errors path="confirm"/>
            <form:input path="confirm" type="password" class="form-control"/>
        </div>
    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>
<form:form action="/login" method= "POST" class="container" modelAttribute="newLogin">
  		
        	<div class="form-group">
            <form:label path="email">Email:</form:label>
            <form:errors path="email"/>
            <form:input path="email" class="form-control"/>
        </div>
        	<div class="form-group">
            <form:label path="password">Password:</form:label>
            <form:errors path="password"/>
            <form:input path="password" type="password" class="form-control"/>
        </div>
    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form> 
</div>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</body>
</html>