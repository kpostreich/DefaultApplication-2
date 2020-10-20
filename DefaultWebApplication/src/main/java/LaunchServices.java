

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

	public class LaunchServices extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	       
	        String paramName = "param1";
			String paramValue = request.getParameter(paramName);

			//out.write(paramName);
			//out.write(" = ");
			//out.write(paramValue);
			//out.write("n");
	        
	        
	        
	      if (request.getParameter(paramName) != null) {
          //      return params.get( name );
	    	  
	        //String paramValue = request.getParameter(paramName);
	        System.out.println("param1= " + paramValue);
	    	//String message = "Hello World";
	        //request.setAttribute("message", message); // This will be available as ${message}
	        
	        if (paramValue.contentEquals("snoop")) 
	          request.getRequestDispatcher("/snoop/").forward(request, response);
	        else 
	        	if (paramValue.contentEquals("hitcount")) 
	          request.getRequestDispatcher("/hitcount").forward(request, response);
	        	else
	        	  //default to snoop 	
	        	  request.getRequestDispatcher("/snoop/").forward(request, response);
	        
	        //out.println("Hello World");
	        out.flush();
	    }
	      else System.out.println("Request parameter is null");  
	  }    
	}
