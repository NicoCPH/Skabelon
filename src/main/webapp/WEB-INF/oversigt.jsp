<%--
  Created by IntelliJ IDEA.
  User: Henne
  Date: 04-03-2020
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt </title>
</head>
<body>

<br>
<br>
<h1>Dette er en oversigt over alle kunder.</h1>
<br>
<br>
<c:forEach var="element" items="${requestScope.res}">

    <br>
    ${element.value.email}
    ${element.key}
    <br>

</c:forEach>
<br>
Antal kunder: ${requestScope.res.size()}
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
