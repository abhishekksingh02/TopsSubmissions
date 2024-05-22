<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
   
<%
    String otp = request.getParameter("otp");
    String otp2 = request.getParameter("otp2");
    String otp3 = request.getParameter("otp3");
    String otp4 = request.getParameter("otp4");
    
    int otp11 = Integer.parseInt(otp);
    int otp22 = Integer.parseInt(otp2);
    int otp33 = Integer.parseInt(otp3);
    int otp44 = Integer.parseInt(otp4);
    
    int n1 = (int) session.getAttribute("n1");
    int n2 = (int) session.getAttribute("n2");
    int n3 = (int) session.getAttribute("n3");
    int n4 = (int) session.getAttribute("n4");
    
    if (otp11 == n1 && otp22 == n2 && otp33 == n3 && otp44 == n4) {
        String name = (String) session.getAttribute("name");
        String email = (String) session.getAttribute("email");
        String pwd = (String) session.getAttribute("pwd");
        String cpwd = (String) session.getAttribute("cpwd");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module4", "root", "");
            
            PreparedStatement ps = con.prepareStatement("select * from module4q9 where email=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                out.print("Exist");
            } else {
                PreparedStatement ps2 = con.prepareStatement("insert into module4q9 (name, email, pwd, cpwd) values(?,?,?,?)");
                ps2.setString(1, name);
                ps2.setString(2, email);
                ps2.setString(3, pwd);
                ps2.setString(4, cpwd); 
                
                int data = ps2.executeUpdate();
                out.print(data);
                
                RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet");
                request.setAttribute("e1", email);
                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        response.sendRedirect("index.jsp");
    }
%>

</body>
</html>
