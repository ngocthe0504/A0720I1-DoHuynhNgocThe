<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2021
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Phong tro</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/lixbs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .a {
            float: right;
            margin: 30px;
        }
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
    </style>
</head>
<body>
<form action="search" method="post">
    <div class="a">
        <input type="text" placeholder="Search" name="search" type="search" class="form-control rounded search" aria-label="Search"
               aria-describedby="search-addon" >
        <input type="submit" value="Search" type="button" class="btn btn-outline-primary button">
    </div>
</form>
    <a href="create"><button type="button" class="btn btn-primary create">Create new information</button></a>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Tên người thuê</th>
            <th scope="col">SDT</th>
            <th scope="col">Ngày bắt đầu</th>
            <th scope="col">Hình thức thanh toán</th>
            <th scope="col">Ghi chú</th>
            <th scope="col">Delete</th>
        </tr>
        <c:forEach items="${phongTroList}" var="phongTro">
        <tr>
            <td scope="row"><a href="view?id=${phongTro.id}">${phongTro.tenNguoiThue}</a></td>
            <td>${phongTro.sdt}</td>
            <td>${phongTro.ngayThue}</td>
            <td>${phongTro.hinhThucThanhToan}</td>
            <td>${phongTro.ghiChu}</td>
            <td><a href="delete?id=${phongTro.id}" ><button type="button" class="btn btn-danger">Delete</button></a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
