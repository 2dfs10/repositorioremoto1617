

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Url2
 */
@WebServlet("/Url2")
public class Url2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Url2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Codigo resuelto para leer cabeceras
		
		// http://www.mkyong.com/java/how-to-get-http-response-header-in-java/
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		URL obj = new URL("http://www.as.com");
		URLConnection conn = obj.openConnection();
		
		//get all headers
		Map<String, List<String>> map = conn.getHeaderFields();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			
			out.println ("cabecera: "+ entry.getKey()+ "<br>valor: "+entry.getValue());
			out.println("<br>");
			out.println("<br>");
			
		/*	System.out.println("Key : " + entry.getKey() + 
	                 " ,Value : " + entry.getValue());*/
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
