import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
	
		out.print("<!doctype html>");
		out.print("<html lang='en' class='h-100'>");
		out.print("<head>");
		
		 
//		  
//		    <meta charset="utf-8">
//		    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
//
//		    <!-- Bootstrap CSS -->
//		    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
//		    <link rel="stylesheet" href="assets/css/style.css">
//		    <link rel="shortcut icon" href="assets/img/favicon.ico" type="image/x-icon">
//
//		    <title>List of User</title>
//		   
//		  </head>
//		  <body class="d-flex flex-column h-100">
//		    
//		    <div class="container pt-4 pb-4">
//		        <nav class="navbar navbar-expand-lg navbar-light bg-light rounded">
//		            <a class="navbar-brand" href="#">HTML CRUD Template</a>
//		            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample09" aria-controls="navbarsExample09" aria-expanded="false" aria-label="Toggle navigation">
//		                <span class="navbar-toggler-icon"></span>
//		            </button>
//		    
//		            <div class="collapse navbar-collapse" id="navbarsExample09">
//		                <ul class="navbar-nav mr-auto">
//		                    <li class="nav-item active">
//		                        <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
//		                    </li>
//		                    <li class="nav-item">
//		                        <a class="nav-link" href="create.html">Create</a>
//		                    </li>
//		                    <li class="nav-item">
//		                        <a class="nav-link" href="#">FAQ</a>
//		                    </li>
//		                    <li class="nav-item">
//		                        <a class="nav-link" href="https://pisyek.com/contact">Help</a>
//		                    </li>
//		                </ul>
//		                <form class="form-inline my-2 my-md-0">
//		                <input class="form-control" type="text" placeholder="Search" aria-label="Search">
//		                </form>
//		            </div>
//		        </nav>
//		    </div>
//		        
//		    <main role="main" class="flex-shrink-0">
//		        <div class="container">
//		            <h1>List of User</h1>
//		            <table class="table table-striped table-hover">
//		             
//		              	
//		              		<tr><th>Id</th><th>Firstname</th><th>Lastname</th><th>Mobile</th><th>Technology</th><th>Fees</th></tr>
//		              		
//		              		
//		              		
//		              		
//		              	
//		            </table>
//		        </div>
//		    </main>
//		      
//		    <footer class="footer mt-auto py-3">
//		        <div class="container pb-5">
//		            <hr>
//		            <span class="text-muted">
//		                    Copyright &copy; 2019 | <a href="https://pisyek.com">Pisyek.com</a>
//		            </span>
//		        </div>
//		    </footer>
//
//		    
//		    <script src="assets/js/jquery-3.3.1.slim.min.js"></script>
//		    <script src="assets/js/popper.min.js"></script>
//		    <script src="assets/js/bootstrap.min.js"></script>
//		  </body>
//		</html>
		
	out.print("<a href='create.html'>Add Data</a>");
		
		out.print("<table border='1'cellpadding='5' cellspacing='5' class='table table-striped table-hover'>");
		
		out.print("<tr><th>Id</th><th>Firstname</th><th>Lastname</th><th>Mobile</th><th>Technology</th><th>Fees</th><th>Edit</th><th>Delete</th></tr>");
		
		List<Model>list = Dao.viewdata();
		
		for(Model m :list)
		{
			out.print("<tr><td>"+m.getId()+"</td><td>"+m.getFname()+"</td><td>"+m.getLname()+"</td><td>"+m.getMob()+"</td><td>"+m.getTechnology()+"</td><td>"+m.getFees()+"</td><td><a href='EditServlet?id="+m.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+m.getId()+"'>Delete</a></td></tr>");
		}
		
		
		
		out.print("</table>");
		
		
		
		
	}
}
