<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.yourcompany.todo.Todo" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>To-Do List</title>
</head>
<body>
<h1>List of To-Dos</h1>
<div>
    <form action="actionServlet" method="post">
        <button type="submit" name="action" value="add">Add a new To-Do</button>
        <button type="submit" name="action" value="delete" id="delete-button">Delete a To-Do</button>
    </form>


</div>
<br>
<div>
    <h2>To-Do List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Due Date</th>
        </tr>

<%
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo", "root", "Helloworld420");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM todo");

            while(resultSet.next()) {
                int id = resultSet.getInt("id") ;
                String title = resultSet.getString("title") ;
                String description = resultSet.getString("description");
                Date dueDate = resultSet.getDate("due_date");
%>
        <tr>
            <td><%= id %></td>
            <td><%= title %></td>
            <td><%= description %></td>
            <td><%= dueDate %></td>

        </tr>
        <%
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        %>


    </table>
</div>
</body>
</html>
