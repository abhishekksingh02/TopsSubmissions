<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%
    try {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String cpwd = request.getParameter("cpwd");

        // Set Attributes to Session
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setAttribute("pwd", pwd);
        session.setAttribute("cpwd", cpwd);

        // Performing Database Operation
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module4", "root", "");
        PreparedStatement ps = con.prepareStatement("select * from module4q9 where email=?");
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            out.println("<h1>Email has been already in use, try entering new Email!!</h1>");
        } else {
            int number11 = 1 + (int) (9 * Math.random());
            int number22 = 1 + (int) (9 * Math.random());
            int number33 = 1 + (int) (9 * Math.random());
            int number44 = 1 + (int) (9 * Math.random());

            session.setAttribute("n1", number11);
            session.setAttribute("n2", number22);
            session.setAttribute("n3", number33);
            session.setAttribute("n4", number44);

            // Forwarding request to EmailSendingServlet2
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
        e.printStackTrace();
        out.println("An error occurred: " + e.getMessage());
    }
%>
</body>
</html>
