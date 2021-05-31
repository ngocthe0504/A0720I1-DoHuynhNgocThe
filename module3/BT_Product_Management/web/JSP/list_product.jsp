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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        table, tr, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
        .search {
            width: 300px;
        }
    </style>
</head>
<body>
    <h1>List Product</h1>
    <form action="search" method="post">
        Search
            <input type="text" placeholder="Search" name="search" type="search" class="form-control rounded search" aria-label="Search"
               aria-describedby="search-addon" >
        <input type="submit" value="Search" type="button" class="btn btn-outline-primary">
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
</body>
</html>
