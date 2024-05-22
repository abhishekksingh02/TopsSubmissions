package com.email;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/EmailSendingServlet")
public class EmailSendingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private String host;
    private String port;
    private String user;
    private String pass;

    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        String email = (String) session.getAttribute("email");

        if (email == null || email.trim().isEmpty()) {
            out.print("<h1>Please Enter Email!!</h1>");
            return;
        }

        String subject = "Welcome";
        String content = "Module 4 question 9 success...";

        try {
            EmailUtility.sendEmail(host, port, user, pass, email, subject, content);
            Thread.sleep(3000);
            resp.sendRedirect("login.jsp");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
