<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 02.03.2018
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"><%@include file="js/contacts.js"%></script>
</head>
<body onload="getContacts()">

    <fieldset>
        <legend>Добавить новый контакт</legend>
        <form action="/new_contact" method="post">
            <p>Имя</p><input type="text" id="name" name="name">
            <p>Фамилия</p><input type="text" id="surname" name="surname">
            <p>Почта</p><input type="text" id="email" name="email">
            <p>Телефон</p><input type="text" id="phone" name="phone">
            <input type="submit" value="Добавить">
        </form>
    </fieldset>

    <br>

    <fieldset>
        <legend>Список контактов</legend>
        <table id="contacts">
            <tr>
                <th>№</th>
                <th>Имя</th>
                <th>Фамилия</th>
                <th>E-mail</th>
                <th>Телефон</th>
            </tr>
        </table>
    </fieldset>
</body>
</html>
