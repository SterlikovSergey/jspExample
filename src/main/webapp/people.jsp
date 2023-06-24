<%@ page import="java.util.List" %>
<%@ page import="by.sterlikov.jspexample.model.Person" %><%--
  Created by IntelliJ IDEA.
  User: sergeysterlikov
  Date: 21.06.23
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>People information</title>
</head>
<body>
<h1>People: </h1>
<%
    List<Person> people = (List<Person>)request.getAttribute("people");

    for(Person person:people){
        out.println(person);
    }
%><br>
<h1>What you want</h1>
<a href="add_person.jsp">Add additional person</a>
<a href="/persons">See all people</a>
<a href="/logout">Logout</a>
</body>
</html>
