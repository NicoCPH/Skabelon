<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        

        <h1>Hello ${sessionScope.email} </h1>

        <br>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <br>

        Her opretter du en ny employee

        <br>
        <form name="registerEmployee" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="registeremployee">
            Email:<br>
            <input type="text" name="email" value="someone@nowhere.com">
            <br>
            Password:<br>
            <input type="password" name="password1" value="sesam">
            <br>
            Retype Password:<br>
            <input type="password" name="password2" value="sesam">
            <br>
            <input type="submit" value="Submit">
        </form>
        <br>

        Her sletter du en kunde:

        <br>
        <form name="deleteemployee" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="deleteemployee">
            id:<br>
            <input type="text" name="id">
            <input type="submit" value="Submit">
        </form>
        Reset password for givent id.
        <br>
        <form name="resetpassword" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="resetpassword">
            id:<br>
            <input type="text" name="id">
            <input type="submit" value="Submit">
        </form>

        <br>
        <form name="oversigt" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="oversigt">
            <input type="submit" value="oversigt">
        </form>
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
