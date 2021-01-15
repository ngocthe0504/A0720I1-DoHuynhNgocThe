<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/13/2021
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
    <style>
        table, tr, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
        table tr td input {
            border: white;
        }
    </style>
</head>
<body>
    <h1>Create new product</h1>
    <form action="create" method="post">
        <table>
            <tr>
                <th>Id</th>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>Price</th>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <th>Producer</th>
                <td><input type="text" name="producer"></td>
            </tr>
            <tr>
                <th>Description</th>
                <td><input type="text" name="description"></td>
            </tr>
        </table>
            <input type="submit" value="Create">
            <input type="reset" value="Reset">
        <input type="hidden" name="action" value="create">
        <a href="list">Back to list</a>
    </form>
</body>
</html>
