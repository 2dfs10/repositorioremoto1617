package ejercicio1;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookie
 */
@WebServlet("/SetCookie")
public class SetCookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetCookie1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String nombre = request.getParameter("nombre");
		String gustos = request.getParameter("gustos");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
  
		Cookie cookie = new Cookie(nombre, gustos);
		cookie.setMaxAge(60*60*24*30);
		response.addCookie(cookie);
		
		// response.setHeader("Refresh", "0; URL="  + gustos + ".html");
		response.setHeader("Refresh", "0; URL=" +"../ExamenRec1T2016/ejercicio1/"+gustos+".html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
