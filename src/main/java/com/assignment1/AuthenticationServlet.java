package com.assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("auca".equals(username) && "password".equals(password)) {
            res.sendRedirect("welcome.html");
        } else {
        	
//        	BEFORE REDIRECTING USER TO FORGET PASSWORD, I FIRST WANT TO SHOW USER WANT HAPPENED BY DISPLAYING ERROR FOR 1.5 SEC
        	
        	PrintWriter out = res.getWriter();
        	out.println("<html><head>");
        	out.println("<style>");
        	out.println(".error-message { display: flex; justify-content: center; align-items: center; height: 100vh; }");
        	out.println(".error-message h1 { color: red;font-weight: bold; }");
        	out.println("</style>");
        	out.println("</head><body>");
        	out.println("<div class='error-message'>");
        	out.println("<h1>Login failed: Incorrect username or password!</h1>");
        	out.println("</div>");
        	out.println("<script>");
        	out.println("setTimeout(function() { window.location.href = 'forgetPassword.html'; }, 1500);");
        	out.println("</script>");
        	out.println("</body></html>");


        }
    }
}
