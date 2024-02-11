<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <h1>Save Dojo</h1>
    <h2 class="container text-danger">New Ninja</h2>
    <!-- rest of your form -->
<form:form action="/ninjas/processForm" method="POST" class="container" modelAttribute="ninja">
    <p class="form-group">
        <form:label path="dojo">Dojo</form:label>
        <form:select path="dojo">
            <form:options items="${allDojos}" itemValue="id" itemLabel="name" />
        </form:select>
    </p>
    <!-- rest of your form -->
</form:form>
  
    <!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
