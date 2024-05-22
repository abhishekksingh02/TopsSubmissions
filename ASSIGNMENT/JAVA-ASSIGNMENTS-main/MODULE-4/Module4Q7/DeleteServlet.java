import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet 
{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			//super.doGet(req, resp);
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String id = req.getParameter("id");
			int id2 = Integer.parseInt(id);
			
			Dao.deletedata(id2);
			
			resp.sendRedirect("ViewServlet");
			
			
			
		}
}
