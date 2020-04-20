

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import p.D;


public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		 D obj=new D(); 
         boolean b=obj.saveDetails(username);
         
         PrintWriter out=response.getWriter();
        if(b==true)
        {
          out.println("<h1>user details sucessfully saved.</h1>");
           
        }
	}

	
	

}
