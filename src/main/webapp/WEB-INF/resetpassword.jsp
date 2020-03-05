<%--
  Created by IntelliJ IDEA.
  User: Lange
  Date: 05/03/2020
  Time: 11.11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Password nulstilling</title>
</head>
<body>
<h1>Password Nulstillet på givent id til 123456</h1>
<br>
<form action="FrontController" method="post">
    <%--    <label for="name">Skriv varer:</label><br>
        <input type="text" id="name" name="productName"><br> --%>
    <input type="hidden" name="taget" value="logout">
    <input type="submit" value="Logout">
</form>
</body>
</html>
