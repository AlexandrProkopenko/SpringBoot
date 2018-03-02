<%--
  Created by IntelliJ IDEA.
  User: nucleos
  Date: 28.02.18
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <script type="text/javascript">
        <%@include file="js/dashboard.js"%>
    </script>
</head>
<body>
    <fieldset>
        <legend>Тестовая форма</legend>
        <form onsubmit="return submitYopta()">
            <p>Name : </p><input id="name" type="text"><br/>
            <input type="submit" value="Submit" onclick="submitYopta()">
        </form>
    </fieldset>
</body>
</html>
