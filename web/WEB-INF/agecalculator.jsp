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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1><br>
        <form method="POST" action="age">
            <label>Enter your age: </label>
            <input type="number" name="how_old" min="0" value=""><br>
            <input type="submit" value="Age next birthday"><br>
            <span name="error messages"></span>
                
        </form>
    </body>
</html>
