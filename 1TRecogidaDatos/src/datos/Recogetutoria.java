package datos;

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

    /**
     * Default constructor. 
     */
    public Recogetutoria() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String valumno = request.getParameter("alumno");
		String voculto=request.getParameter("pagado");
		String vdni=request.getParameter("dni");
		String vprofesor = request.getParameter("rofesor");

		String vhora = request.getParameter("hora");

		String[] vasignatura = request.getParameterValues("asignatura");

		String vobservaciones = request.getParameter("observaciones");
		
		out.println("Valor de oculto "+voculto);
		
		//cuenta++;
		// out.println("Valor de cuenta "+cuenta);
		out.println(" El Nombre del alumno es:" + valumno);
		out.print("<br>");
		out.print("<br>");
		out.print(" El nombre del profesor es:" + vprofesor);
		out.print("<br>");
		out.print("<br>");
		out.print("La hora de tutor�a es :" + vhora);
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
		out.print("<br>");
		out.print("<br>");
		out.print(" Pagado " + voculto);
		out.print(" Ruta Imagen " + vdni);
		out.print("<br>");
		out.print("<br>");
		out.print ("<img src='vdni' width='200' height='195' alt='Tamaño original' border='3'>");
		response.setHeader("Refresh", "10;URL=Tutoria.html");

		/*
		 * response.setHeader("Refresh",
		 * "10;URL=paginacheckboxradiobottom.html");
		 */
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
