<%-- 
    Document   : student-form
    Created on : Feb 20, 2022, 11:50:49 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form:form action="processFormStd" modelAttribute="student">
            First Name: <form:input path="firstName"/>
            <br><br>
            Last Name: <form:input path="lastName"/>
            <br><br>
            <input type="submit" value="Submit"/>
        </form:form>    
    </body>
</html>
