<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Information of customer</p>
<table>
    <tr>
        <td>ID</td>
        <td>${customerA.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${customerA.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${customerA.email}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${customerA.address}</td>
    </tr>

</table>
<a href="list">Back to list</a>
</body>
</html>
