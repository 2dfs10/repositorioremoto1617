

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Segundo2
 */
@WebServlet(
		urlPatterns = { "/Segundo2" }, 
		initParams = { 
				@WebInitParam(name = "nombre", value = "Joselito", description = "nombre del alumno"), 
				@WebInitParam(name = "apellidos", value = "alcantara", description = "apellidos del alumno")
		})
public class Segundo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String vnombre;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Segundo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		vnombre=config.getInitParameter("nombre");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();

		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Datos de recogida</title>");

		out.println("</head>");
		out.println("<body>");
	out.println(" El valor del nombre es "+vnombre);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
