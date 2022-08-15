

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		if (uname == "")
		{	
			out.print("Please enter Username:");  
	        rd=request.getRequestDispatcher("index.html");  
	        rd.include(request,response);  
		}
		else if (pwd == "")
		{
			out.print("Please enter Password:");  
	        rd=request.getRequestDispatcher("index.html");  
	        rd.include(request,response);  
			
		}
		else if(uname.equals("tulasi") && pwd.equals("tulasi"))
		{
			out.println("Logged in Successfully");
		}
		else
		{
			out.print("Sorry username or password error");  
	        rd=request.getRequestDispatcher("index.html");  
	        rd.include(request,response);  
		}
	}

}
