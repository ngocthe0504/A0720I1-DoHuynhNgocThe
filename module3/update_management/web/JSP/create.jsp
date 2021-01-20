<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 9:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
</head>
<body>
    <h1>Create new customer</h1>
    <form action="create" method="post">
        <table>
            <tr>
                <th>ID</th>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><input type="text" name="address"></td>
            </tr>
        </table>
        <input type="submit" value="Create">
        <input type="reset" value="Reset">
        <input type="hidden" name="action" value="create">
        <a href="list">Back to list</a>
    </form>
</body>
</html>
