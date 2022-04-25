package web.application.Users;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserPostServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String userName = req.getParameter("user-name");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        try {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Usuario: </h3>" + userName + "</br>");
            out.println("<h3>Password: </h3>" + password + "</br>");
            out.println("</body>");
            out.println("</html>");   

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            resp.sendError(500, "Big error");
        } finally {
            out.close();
        }

    }

}
