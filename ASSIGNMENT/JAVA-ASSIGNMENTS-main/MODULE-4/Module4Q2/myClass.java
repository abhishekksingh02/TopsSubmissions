package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myClass
 */
@WebServlet("/myClass")
public class myClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // Getting the ServletCo0ntect Object
		ServletContext context = getServletContext();
		
		// Getting the value of initialization parameter
		String database = context.getInitParameter("database");
		
		// Writing the value to the response
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<h1> The Database is: " + database + "</h1>");
	}

	
}
