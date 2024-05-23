<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
   
<%
    String name = request.getParameter("name");  
    String surname = request.getParameter("surname");  
    String phone = request.getParameter("phone");  
    String email = request.getParameter("email");
    String gender = request.getParameter("gender");
    String pwd = request.getParameter("pwd");
    String cpwd = request.getParameter("cpwd");
    
    // Set attributes to session
    session.setAttribute("name", name);
    session.setAttribute("surname", surname);
    session.setAttribute("phone", phone);
    session.setAttribute("email", email);
    session.setAttribute("gender", gender);
    session.setAttribute("pwd", pwd);
    session.setAttribute("cpwd", cpwd);
    
    // Database operations
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorfinderdb", "root", "");  
        PreparedStatement ps = con.prepareStatement("select * from signup where email=?");  
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();  
        if(rs.next()) {      	
            out.println("<h1>Email Id Already exists, try entering a new Email Address.</h1>");   	
        } else {
            int number11 = 1 + (int) (9 * Math.random());
            int number22 = 1 + (int) (9 * Math.random());
            int number33 = 1 + (int) (9 * Math.random());
            int number44 = 1 + (int) (9 * Math.random());
            
            session.setAttribute("n1", number11);
            session.setAttribute("n2", number22);
            session.setAttribute("n3", number33);
            session.setAttribute("n4", number44);
            
            // Forward request to EmailSendingServlet2
            RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet2");
            request.setAttribute("e1", email);
            request.setAttribute("n1", number11);
            request.setAttribute("n2", number22);
            request.setAttribute("n3", number33);
            request.setAttribute("n4", number44);
            rd.forward(request, response);
        }  
        con.close();  
    } catch (Exception e) {
        out.print(e);
    }  
%>
