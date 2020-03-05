<%--
  Created by IntelliJ IDEA.
  User: Henne
  Date: 04-03-2020
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deleteemployee</title>
</head>
<body>
<h1>Du har nu slettet en customer</h1>
<br>

<br>
<form action="FrontController" method="post">
    <%--    <label for="name">Skriv varer:</label><br>
        <input type="text" id="name" name="productName"><br> --%>
    <input type="hidden" name="taget" value="logout">
    <input type="submit" value="Logout">
</form>
<br>
<br>


</body>
</html>
