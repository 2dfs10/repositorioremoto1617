
// Base de datos usuarios

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class injecciosql
 */
@WebServlet("/injecciosql")
public class injecciosql extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Statement sentencia;
	ResultSet resultados = null; // objeto para guardar los resultados

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public injecciosql() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		try 
		{
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		 	String vnombre = request.getParameter("alum");
		 
			
			// Leer el driver específico de la base de datos que vamos a
			// utilizar, en nuestro caso, será:
			 Class.forName("com.mysql.jdbc.Driver").newInstance();

			// Establecer la conexión, tenemos cargado el Driver y ahora
			// establecer la conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/usuarios", "root", "");

			 
			
			String consulta = "select * From usuario where nombre = '"+vnombre+"'";;
			
		 
			sentencia = conexion.createStatement();
			
			//Ejecutamos la orden SQL
			
			 resultados = sentencia.executeQuery(consulta);
			
			 if (resultados.isBeforeFirst())
			 {
				 
			// hay algun record
			 
			 while(resultados.next()){
				 out.println(" alumno "+resultados.getString("nombre"));
				 out.println("<br>");
				
				 out.println("<br>"); 				 
			 }
			 }
			 else{
				 
				 out.println("no hay ningún record");
			 }

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
