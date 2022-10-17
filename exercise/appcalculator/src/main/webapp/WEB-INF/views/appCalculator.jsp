<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/17/2022
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/appcalculator" method="get">
    <input type="text" name="op_1" value=""><input type="text" name="op_2" value="">
    <input type="submit" name="operator" value="add"><input type="submit" name="operator" value="sub">
    <input type="submit" name="operator" value="mul"><input type="submit" name="operator" value="div">
</form>
<h2>Message:${message}</h2>
<h2>Result:${result}</h2>
</body>
</html>
