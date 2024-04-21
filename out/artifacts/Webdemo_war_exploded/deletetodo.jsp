<%--
  Created by IntelliJ IDEA.
  User: Win10
  Date: 3/24/2024
  Time: 3:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="deletetodo.css">
  <title>Delete To-Do</title>
</head>
<body>
<h1>Delete To-Do</h1>
<form action="deleteTodo" method="post">
  <label for="todoId">To-Do ID:</label><br>
  <input type="text" id="todoId" name="todoId" required><br><br>
  <input type="submit" value="Delete To-Do">
</form>
</body>
</html>
