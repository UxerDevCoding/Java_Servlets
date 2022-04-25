package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class AboutServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        try {

            // out.println("<!DOCTYPE html>");
            // out.println("<html>");
            // out.println("<head>");
            // out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            // out.println("<title>Servlet</title>");
            // out.println("</head>");
            // out.println("<body>");
            // out.println("<h1>About</h1>");
            // out.println("</body>");
            // out.println("</html>");

            System.out.println(req.getRequestURL());

            resp.sendRedirect("about.html");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            out.close();
        }

    }

}
