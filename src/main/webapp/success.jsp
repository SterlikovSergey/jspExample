<%--
  Created by IntelliJ IDEA.
  User: sergeysterlikov
  Date: 21.06.23
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>Hello, <%=session.getAttribute("name")%></h1>
<h2>Choose what you want</h2>
<a href="add_person.jsp">Add new person</a>
<a href="/persons">See All people</a>
<a href="/logout">Logout</a>
<jsp:include page="bottom.html"/>
</body>
</html>
