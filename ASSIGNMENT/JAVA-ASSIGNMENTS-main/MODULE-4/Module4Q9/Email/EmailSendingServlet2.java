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
        ServletContext context = this.getServletContext();
        this.host = context.getInitParameter("host");
        this.port = context.getInitParameter("port"); 
        this.user = context.getInitParameter("user");
        this.pass = context.getInitParameter("pass");
        
        //System.out.println("1");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//System.out.println("2");
    	resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String recipient = (String) req.getAttribute("e1"); 
        String subject = "Welcome";
        HttpSession sess = req.getSession();
        int n1 = (int) sess.getAttribute("n1");
        int n2 = (int) sess.getAttribute("n2");
        int n3 = (int) sess.getAttribute("n3");
        int n4 = (int) sess.getAttribute("n4");
        String content = "Module 4 question 9 your OTP is :" + n1 + n2 + n3 + n4;
        //System.out.println("3");
        try {
        	//System.out.println("4");
            EmailUtility.sendEmail(this.host, this.port, this.user, this.pass, recipient, subject, content);
            //System.out.println("5");
            Thread.sleep(3000);
            //System.out.println("6");
            resp.sendRedirect("otp1.jsp");
            //System.out.println("7");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
