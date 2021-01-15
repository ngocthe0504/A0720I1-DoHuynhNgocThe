<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/13/2021
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer</title>
    <style>
        table, tr, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>List Product</h1>
    <form action="search" method="post">
        Search
        <input type="text" placeholder="Search">
        <input type="submit" value="Search${Search}">
    </form>
    <a href="create">Create new product</a>
    <table>
        <tr>
            <td>Name</td>
            <td>Price</td>
            <td>Description</td>
            <td>Producer</td>
            <td>Delete</td>
            <td>Edit</td>
        </tr>
        <c:forEach items="${listProduct}" var="product">
            <tr>
                <td><a href="view?id=${product.id}">${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.description}</td>
                <td>${product.producer}</td>
                <td><a href="edit?id=${product.id}">edit</a></td>
                <td><a href="delete?id=${product.id}">delete</a></td>
            </tr>
        </c:forEach>

    </table>
    <table>
        <c:forEach items="${findProduct}" var="find">
            <tr>
                <td>${find.id}</td>
                <td>${find.name}</td>
                <td>${find.price}</td>
                <td>${find.description}</td>
                <td>${find.producer}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
