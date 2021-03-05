<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <h2>Settings</h2>
    <form:form method="post" modelAttribute="email">
        <label>Language: </label>
        <form:select path="language">
            <form:options items="${language}"/>
        </form:select> <br/>
        <label>Page size:</label>
        <form:select path="size">
            <form:options items="${size}"/>
        </form:select><br/>
        <label>Spam filter:</label>
        <form:checkbox path="spam"/><br/>
        <label>Signature: </label>
        <form:textarea path="signature"/><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
