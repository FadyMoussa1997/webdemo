import com.yourcompany.todo.Todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addTodo")
public class addTodo extends HttpServlet {

    private List<Todo> todoList = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title") ;
        String description = request.getParameter("description") ;
        Date dueDate = Date.valueOf(request.getParameter("dueDate"));

        Connection connection = null;
        RequestDispatcher dispatcher = null ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo", "root", "Helloworld420");
            PreparedStatement add = connection.prepareStatement("insert into todo(title, description, due_date) values (? , ? , ?)") ;

            add.setString(1 , title);
            add.setString(2 , description);
            add.setDate(3 , Date.valueOf(dueDate.toLocalDate()));

            int rowCount = add.executeUpdate();

            if (rowCount>0){
                dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
            } else {
                response.sendRedirect("adduser.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally { try{
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }


/*
        Todo todo1 = new Todo();
        todo1.setTitle(title);
        todo1.setDescription(description);
        todo1.setDue_date(LocalDate.parse(dueDate));

        todoList.add(todo1) ;


 */
       // request.setAttribute("todoList", todoList);

       // RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
       // dispatcher.forward(request, response);






    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
