<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/css/main.css"> <!-- Adjust the path to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- Adjust the path to match your file/naming structure -->
</head>
<body>
    <h1 class="mb-2 block font-sans text-xl font-semibold leading-snug tracking-normal text-blue-gray-900 antialiased">
      Here's Your Travel
    </h1>
    <div class="block font-sans text-base font-light leading-relaxed text-inherit antialiased">
      <h2>Expense Details</h2>
      <p>Expense Name: ${travel.expense }</p>
      <p>Description: ${travel.description }</p>
      <p>Vendor: ${travel.vendor }</p>
      <p>Amount: ${travel.amount }</p>
    </div>
    <div class="p-6 pt-0">
        <a href="/travels">Go back</a>
    </div>
</body>
</html>