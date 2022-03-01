<%-- 
    Document   : helloworld-form
    Created on : Feb 19, 2022, 1:09:27 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Page</title>
    </head>
    <body>
        <form action="processFormTwo" method="GET">
            <input type="text" name="studentName" placeholder="What's your Name?"/> 
            <input type="submit">  
        </form>
    </body>
</html>
