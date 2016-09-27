

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Primero
 */
public class Primero extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	 private int contador;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Primero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String cuenta; 
		cuenta = config.getInitParameter("contador");
		contador = Integer.parseInt(cuenta);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Primerooooooo ").append(request.getContextPath());
		PrintWriter out;
        out = response.getWriter();
 
	
	out.println(" El valor del contador es " +contador);	
	contador++;
	out.print("<br>");
	out.println("fffffff");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
