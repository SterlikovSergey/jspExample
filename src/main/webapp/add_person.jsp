<%--
  Created by IntelliJ IDEA.
  User: sergeysterlikov
  Date: 21.06.23
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add person</title>
</head>
<body>
<form action="/persons" method="post">
    <input type="text" name="name">
    <input type="number" name="age">
    <input type="submit" value="Add person">
</form>

</body>
</html>
