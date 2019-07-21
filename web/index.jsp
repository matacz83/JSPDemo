<%--
  Created by IntelliJ IDEA.
  User: matacz
  Date: 20.07.2019
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSPDemo</title>
</head>
<body>
<h1><% out.print("Hello world!");%></h1>
<br>
Witaj, Matacz!
<br>
<a href="${pageContext.request.contextPath}/hello">Go to hello servlet</a>
</body>
<br>
<form action="form" method="post">
    <br>
    Login: <input name="login" type="login"><br>
    Hasło: <input name="password" type="password"><br>
    <input type="submit" value="submit">
    <br>
    <br>
    <% out.print("Pętla: "); %>
    <br>
    <%for (int i = 1; i < 5; i++) { %>
    <div><%= i %>
    </div>
    <% } %>
</form>
</html>
