package org.example;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/login")
public class Login extends HttpServlet{
    LoginDao login=new LoginDao();
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        HttpSession session=req.getSession();
        PrintWriter out=res.getWriter();
        if(login.checkCredentials(name,password)){
            session.setAttribute("name",name);
            session.setAttribute("password",password);
            res.sendRedirect("welcome.jsp");
        }
        else{
            res.sendRedirect("index.jsp");
            out.println("invalid details");
        }

    }
}
