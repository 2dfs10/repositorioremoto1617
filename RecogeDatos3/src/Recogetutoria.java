import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Recogetutoria
 */
@WebServlet("/Recogetutoria")
public class Recogetutoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int visitas=1 ;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Recogetutoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String valumno = request.getParameter("alumno");
		String voculto=request.getParameter("contador");

		String vprofesor = request.getParameter("profesor");

		String vhora = request.getParameter("hora");

		String[] vasignatura = request.getParameterValues("asignatura");
		String vfoto = request.getParameter("foto");
		String vobservaciones = request.getParameter("observaciones");


		out.println ("El valor de campo oculto es "+voculto);
		out.print("<br>");
		out.print("<br>");
		out.println("Visitas "+visitas);
		out.print("<br>");
		out.print("<br>");
		out.println("El valor del campo foto es "+ request.getParameter("foto"));
		out.println("<img src = 'C:/Users/Public/Pictures/Sample Pictures/Dessert.jpg   width='400' height='300'>");

		out.println(" El Nombre del alumno es:" + valumno);
		out.print("<br>");
		out.print("<br>");
		out.print(" El nombre del profesor es:" + vprofesor);
		out.print("<br>");
		out.print("<br>");
		out.print("La hora de tutoría es :" + vhora);
		out.print("<br>");
		out.print("<br>");

		if (vasignatura == null) {
			out.print("No he seleccionado ninguna asignatura");

		} else {

			for (int i = 0; i < vasignatura.length; i++) {
				out.println(vasignatura[i] + " ");
			}
		}
		out.print("<br>");
		out.print("<br>");

		out.print("Observaciones :" + vobservaciones);

		response.setIntHeader(2);
		//response.setHeader("Refresh", "10;URL=Recoge2");

		/*
		 * response.setHeader("Refresh",
		 * "10;URL=paginacheckboxradiobottom.html");
		 */

		visitas++;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
