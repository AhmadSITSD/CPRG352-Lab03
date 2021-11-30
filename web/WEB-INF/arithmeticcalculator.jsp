<%-- 
    Document   : arithmeticcalculator
    Created on : Oct 3, 2021, 11:01:01 PM
    Author     : 816601
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
        <label>First:</label>
        <input type="number" name="firstnum" value="${firstnumber}"><br>
        <label>Second:</label>
        <input type="number" name="secondnum" value="${secondnumber}"><br>
        <input type="submit" value="+" name="Addition">
        <input type="submit" value="-" name="Subtraction">
        <input type="submit" value="*" name="Multiplication">
        <input type="submit" value="%" name="Modulo">
        </form><br>
        <p>Result: ${result}</p><br>
        <a href="age">Age Calculator</a>
    </body>
</html>
