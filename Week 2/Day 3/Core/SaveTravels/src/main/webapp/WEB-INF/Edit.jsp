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
    <title>Edit</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
</head>
<body>
   <form:form action="/travels/edit/${travel.id }" method= "POST" class="container" modelAttribute="travel"> 
   <input type="hidden" name="_method" value="put">
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
   
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</body>
</html>