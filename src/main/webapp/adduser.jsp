<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="adduser.css">
    <title>Add New To-Do</title>
</head>
<body>
<h1>Add New To-Do</h1>
<form  action="addTodo" method="get">
    <label for="title">Title:</label><br>
    <input type="text" id="title" name="title" required><br>
    <label for="description">Description:</label><br>
    <textarea id="description" name="description" required></textarea><br>
    <label for="dueDate">Due Date:</label><br>
    <input type="date" id="dueDate" name="dueDate" required><br><br>
    <input type="submit" value="Add To-Do">
</form>
</body>
</html>
