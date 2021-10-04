<%-- 
    Document   : agecalculator
    Created on : Oct 3, 2021, 5:20:59 PM
    Author     : 816601
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>agecalculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1><br>
        <form method="POST" action="age">
            <label>Enter your age: </label>
            <input type="text" name="how_old" value="${Age}"><br>
            <input type="submit" value="Age next birthday">  
        </form>
        <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
