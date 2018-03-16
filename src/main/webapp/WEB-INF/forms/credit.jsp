<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 16.03.2018
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<legend>Клиент : </legend>
<form: form action="/forms/confirm" modelAttribute="customerForm">
    <span>Credit: </span><form:input path="credit"/><br/>

    <input type="submit" value="Submit">
</form:>
</body>
</html>
