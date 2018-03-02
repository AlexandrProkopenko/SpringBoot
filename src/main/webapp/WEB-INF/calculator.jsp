<%--
  Created by IntelliJ IDEA.
  User: nucleos
  Date: 28.02.18
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <script type="text/javascript">
        <%@include file="js/calculator.js"%>
    </script>
    <style type="text/css">
        <%@include file="css/calculator.css"%>
    </style>
</head>
<body>
<fieldset>
    <legend>Калькулятор : </legend>
    <div>
        А:<input class="inputs" id="valueA" type="text"><br/>
        B:<input class="inputs" id="valueB" type="text"><br/>
        <input class="buttons" type="button" onclick="sum()" value="+">
        <input class="buttons" type="button" onclick="sub()" value="-">
        <input class="buttons" type="button" onclick="mul()" value="*">
        <input class="buttons" type="button" onclick="div()" value="/">
    </div>
</fieldset>
</body>
</html>
