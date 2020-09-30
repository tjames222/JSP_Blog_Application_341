package SessionManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sessions 
{
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException 
		{
		 HttpSession session = request.getSession(false);
		 if (session != null) 
			 {
		      return;
		      System.out.println("Fail");
			 } 
		 else 
			 {
		 	  session.setAttribute("username", "Users");
	    	  session.setMaxInactiveInterval(300);
	    	  System.out.println("Success" + session.getAttribute("username"));
			 }
	    	
		}
	
	
	
}
