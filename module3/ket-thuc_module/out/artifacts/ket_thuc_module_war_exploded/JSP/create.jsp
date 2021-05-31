<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2021
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new customer</h1>
<form action="create" method="post">
    <table>
        <tr>
            <th>ID phòng trọ</th>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <th>Tên người thuê</th>
            <td><input type="text" name="tenNguoiThue"></td>
        </tr>
        <tr>
            <th>SDT</th>
            <td><input type="text" name="sdt"></td>
        </tr>
        <tr>
            <th>ID người thuê</th>
            <td><input type="text" name="idNguoiThue"></td>
        </tr>
        <tr>
            <th>Ngày bắt đầu thuê</th>
            <td><input type="text" name="ngayThue"></td>
        </tr>
        <tr>
            <th>Ghi chú</th>
            <td><input type="text" name="ghiChu"></td>
        </tr>
    </table>
    <input type="submit" value="Create">
    <input type="reset" value="Reset">
    <input type="hidden" name="action" value="create">
    <a href="list">Back to list</a>
</form>
</body>
</html>
