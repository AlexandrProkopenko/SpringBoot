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
    <title>Customer Form - Registration</title>
</head>
<body>
    <fieldset>
        <legend>Клиент : </legend>
        <form: form action="/forms/account" modelAttribute="customerForm">
            <span>Name: </span><form:input path="name"/><br/>
            <span>Surname: </span><form:input path="surname"/><br/>
            <span>Age: </span><form:input path="age"/><br/>
            <input type="submit" value="Submit">
        </form:>
    </fieldset>
</body>
</html>
