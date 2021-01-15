<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/4/2021
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Vietnamese Dictionary</h1>
<form action="dictionary" method="post">
    <input type="text" placeholder="Enter your word: " name="values">
    <input type="submit" value="Search">
    <p>${input}</p>
    <p>result: ${kq}</p>

</form>
</body>
</html>
