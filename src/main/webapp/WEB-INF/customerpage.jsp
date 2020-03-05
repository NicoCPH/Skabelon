<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>

        <h1>Hello ${sessionScope.email} </h1>
        <br>
        You are now logged in as a customer of our wonderful site.
        <br>
        <br>
        <br>
        <form action="FrontController" method="post">
            <input type="hidden" name="taget" value="changepassword">
            <input type="text" name="id">
            <br>
            Type password:
            <br>
            <input type="password" name="password1" value="sesam">
            <br>
            Retype Password:
            <br>
            <input type="password" name="password2" value="sesam">
            <input type="submit" value="submit">
        </form>
        <br>
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
