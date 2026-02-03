package org.example;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/logout")
public class Logout extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        HttpSession session=req.getSession();
        session.removeAttribute("name");
        session.invalidate();
        res.sendRedirect("index.jsp");
    }
}
