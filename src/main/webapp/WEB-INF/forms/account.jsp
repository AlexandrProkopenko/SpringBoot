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
    <title>Account Data - Registration</title>
</head>
<body>
<fieldset>
    <legend>Клиент : </legend>
    <form: form action="/forms/credit" modelAttribute="customerForm">
        <span>Login: </span><form:input path="login"/><br/>
        <span>Password: </span><form:input path="password"/><br/>
        <input type="submit" value="Submit">
    </form:>
</fieldset>
</body>
</html>
