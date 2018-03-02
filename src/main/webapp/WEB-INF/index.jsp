<%--
  Created by IntelliJ IDEA.
  User: nucleos
  Date: 28.02.18
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Spring Boot Example</title>
    <script type="text/javascript"><%@include file="js/index.js"%></script>
    <style type="text/css"><%@include file="css/index.css"%></style>
</head>

<body>

    <%-- HTML - --%>
    <%-- Заголовки --%>
    <h1>Заголовок 1</h1>
    <h2>Заголовок 2</h2>
    <h3>Заголовок 3</h3>
    <h4>Заголовок 4</h4>
    <h5>Заголовок 5</h5>
    <h6>Заголовок 6</h6>

    <%-- Текстовая информация --%>
    <%-- Параграф --%>
    <p>Параграф 1</p>
    <span>Просто текст 1</span><br/>

    <p>Параграф 2</p>
    <span>Просто текст 1</span><br/>

    <%-- Деление на блоки --%>
    <div>
        <div>
            <%-- Разметка --%>
            <fieldset>
                <legend>Заголовок 1</legend>
                <p>Функциональный блок 1</p>
            </fieldset>
        </div>
        <div>
            <%-- Разметка --%>
            <fieldset>
                <legend>Заголовок 2</legend>
                <p>Функциональный блок 2</p>
            </fieldset>
        </div>
    </div>

    <a href="/dash" methods="get">Переход на dashboard.jsp</a>
    <a href="/calc" methods="get">Переход на calculator.jsp</a>

</body>
</html>
