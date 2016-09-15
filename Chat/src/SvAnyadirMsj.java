import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/SvAnyadirMsj")
public class SvAnyadirMsj extends HttpServlet
{
  protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
  throws IOException, ServletException
  {
    // Obtener el mensaje y qui�n lo ha enviado
    String apodo = request.getParameter("apodo");
    String mensaje = request.getParameter("mensaje");
    
    // A�adir el mensaje recibido a la conversaci�n
    Conversacion.a�adirMensaje(apodo + ": " + mensaje);
    
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    // Responder al cliente envi�ndole el formulario "enviar mensaje"
    out.println("<html><body>" +
    "<form method='POST' " +
      "action='SvAnyadirMsj'>" +
        "<input type='text' size='12' value='" + apodo +
                         "' name='apodo'>" +
        "<input type='text' size='68' name='mensaje'>" +
        "<input type='submit' value='Enviar'>" +
    "</form>" +
    "</body></html>");
  }
}
