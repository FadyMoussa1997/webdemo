import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/actionServlet")
public class actionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getParameter("action");

        switch (action) {

            case "add":
                response.sendRedirect("adduser.jsp");
                break;

            case "delete":
                response.sendRedirect("deletetodo.jsp");
                break;

            default:
                response.sendRedirect("index.jsp");

        }

    }
}
