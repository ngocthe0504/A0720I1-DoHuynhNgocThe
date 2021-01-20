<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
    <form action="edit" method="post">
        <table>
            <tr>
                <th>ID</th>
                <td><input type="text" name="id" value="${customer.id}" readonly></td>
            </tr>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name" value="${customer.name}"></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="text" name="email" value="${customer.email}"></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><input type="text" name="address" value="${customer.address}"></td>
            </tr>
        </table>
        <input type="submit" value="Save">
        <input type="reset" value="Reset">
        <input type="hidden" name="action" value="edit">
        <a href="list">Back to list</a>
    </form>
</body>
</html>
