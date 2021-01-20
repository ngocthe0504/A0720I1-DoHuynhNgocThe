<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer</title>
    <style>
        table, tr, td, th {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>List customer</h1>
    <a href="create">Create new customer</a>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td><a href="view?id=${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="edit?id=${customer.id}">Edit</a></td>
                <td><a href="delete?id=${customer.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
