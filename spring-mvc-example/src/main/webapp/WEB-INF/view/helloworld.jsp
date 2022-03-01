<%-- 
    Document   : helloworld
    Created on : Feb 19, 2022, 1:16:25 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World of Spring</title>
    </head>
    <body>
        Student Name: ${param.studentName}
        <br><br>
        The Message: ${message}
    </body>
</html>
