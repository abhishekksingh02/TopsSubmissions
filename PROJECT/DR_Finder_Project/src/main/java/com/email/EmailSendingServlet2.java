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

@WebServlet("/EmailSendingServlet2")
public class EmailSendingServlet2 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private String host;
    private String port;
    private String user;
    private String pass;

    public EmailSendingServlet2() {
    }

    @Override
    public void init() throws ServletException {
        super.init();
        ServletContext context = this.getServletContext();
        this.host = context.getInitParameter("host");
        this.port = context.getInitParameter("port");
        this.user = context.getInitParameter("user");
        this.pass = context.getInitParameter("pass");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String recipient = (String) req.getAttribute("e1");
        String subject = "Welcome to One Health";
        HttpSession sess = req.getSession();
        int n1 = (int) sess.getAttribute("n1");
        int n2 = (int) sess.getAttribute("n2");
        int n3 = (int) sess.getAttribute("n3");
        int n4 = (int) sess.getAttribute("n4");
        String content = "Discover a diverse array of expert doctors right at your fingertips on our health website. From specialists to general practitioners, we offer a comprehensive selection of healthcare professionals ready to assist you. Easily consult and book appointments with the doctor of your choice, all from the convenience of your own home. Your journey to better health begins with us. Your OTP is: " + n1 + n2 + n3 + n4;

        try {
            EmailUtility.sendEmail(this.host, this.port, this.user, this.pass, recipient, subject, content);
            Thread.sleep(3000);
            resp.sendRedirect("otp1.jsp");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
