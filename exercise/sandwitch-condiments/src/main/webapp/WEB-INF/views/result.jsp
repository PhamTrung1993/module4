<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/17/2022
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sandwitch Condiments Listing</title>
</head>
<body>
<h1>Sandwitch Codiment Listing</h1>
<ol>
    <c:forEach items="${condiments}" var="sandwitch">
        <li><c:out value="${sandwitch}"></c:out></li>
    </c:forEach>
</ol>
</body>
</html>
