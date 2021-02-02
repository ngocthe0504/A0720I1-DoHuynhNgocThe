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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/lixbs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
       .search {
           width: 200px;
           display: inline;

       }
        .list {
            height: 200px;
            background-color: aqua;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .button {
            vertical-align: unset;
        }
        .a {
            float: right;
            margin: 30px;
        }
        .create {
            margin: 20px 0 30px 20px;
        }
    </style>
</head>
<body>
    <div class="list"><h1><a href="list">List customer</a></h1></div>
    <form action="search" method="post">
        <div class="a">
            <input type="text" placeholder="Search" name="search" type="search" class="form-control rounded search" aria-label="Search"
                   aria-describedby="search-addon" >
            <input type="submit" value="Search" type="button" class="btn btn-outline-primary button">
        </div>
    </form>
    <a href="create"><button type="button" class="btn btn-primary create">Create new customer</button></a>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td scope="row"><a href="view?id=${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="edit?id=${customer.id}"><button type="button" class="btn btn-success">Edit</button></a></td>
                <td><a href="delete?id=${customer.id}" ><button type="button" class="btn btn-danger">Delete</button></a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
