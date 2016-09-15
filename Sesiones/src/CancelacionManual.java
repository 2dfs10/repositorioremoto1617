/*
 * CancelacionManual.java
 *
 */

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/CancelacionManual")
public class CancelacionManual extends HttpServlet
{
  public void doGet(HttpServletRequest request, 
                    HttpServletResponse response)
  throws ServletException, IOException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Cancelaci�n manual</title></head>");
    out.println("<body><center>");

    // Obtener la sesi�n actual; crear una si fuera necesario.
    HttpSession sesi�n = request.getSession(true);
    
    // Cancelar la sesi�n si transcurrieron m�s de 3 horas desde
    // que fue creada o ha permanecido inactiva m�s de 1 minutos.
    if (!sesi�n.isNew()) // si la sesi�n no es nueva
    {  
      out.println("<p><h3>Sesi�n en curso</h3></p>");
      Date transcurrido = new Date(System.currentTimeMillis() -
                                   3*60*60*1000);
      Date inactividad = new Date(System.currentTimeMillis() -
                                   1*60*1000);
      Date creada = new Date(sesi�n.getCreationTime());
      Date accedida = new Date(sesi�n.getLastAccessedTime());

      if (creada.before(transcurrido) || accedida.before(inactividad))
      {
        sesi�n.invalidate();
        out.println("<p><h3>Sesi�n cancelada</h3></p>");
        sesi�n = request.getSession(true);  // una nueva sesi�n
        out.println("<p><h3>Se inicia una sesi�n nueva</h3></p>");
      }
    }
    else
      out.println("<p><h3>Sesi�n nueva</h3></p>");
    out.println("</center></body></html>");

    // Continuaci�n del proceso...
  }
}
