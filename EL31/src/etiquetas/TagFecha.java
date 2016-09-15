package etiquetas;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.*;

public class TagFecha extends SimpleTagSupport
{
  private int formato; // 12 o 24 horas
  
  public void doTag() throws JspException, IOException
  {
    Calendar fechaHoraActual = new GregorianCalendar();
    int hora, minutos;
    if (formato == 12)
      hora = fechaHoraActual.get(Calendar.HOUR);
    else
      hora = fechaHoraActual.get(Calendar.HOUR_OF_DAY);
    minutos = fechaHoraActual.get(Calendar.MINUTE);
    String fecha = new String(
             fechaHoraActual.get(Calendar.DAY_OF_MONTH) + "/" +
            (fechaHoraActual.get(Calendar.MONTH) + 1) + "/" +
             fechaHoraActual.get(Calendar.YEAR) );
    getJspContext().setAttribute("hora", String.valueOf(hora));
    getJspContext().setAttribute("minutos", String.valueOf(minutos));
    getJspContext().setAttribute("fecha", fecha);
    getJspBody().invoke(null);
/*
    java.io.StringWriter sw = new java.io.StringWriter();
    getJspBody().invoke(sw);
    getJspContext().getOut().println(sw.toString().toUpperCase());
 */    
  }

  public void setFormato(int f)
  {
    formato = f;
  }
}
