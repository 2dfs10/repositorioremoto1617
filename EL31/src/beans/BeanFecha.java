//BeanFecha.java
package beans;


import java.util.*;

public class BeanFecha
{
private Calendar fechaHoraActual;
private int formato; // 12 o 24 horas
private int hora;
private int minutos;

// Constructor sin argumentos
public BeanFecha()
{
 formato = 24; // por omisión
 fechaHoraActual = new GregorianCalendar();
}

// Implementación de las propiedades
public int getFormato()
{
 return formato;
}

public void setFormato(int f)
{
 formato = f;
}

public int getHora()
{
 if (formato == 24)
   hora = fechaHoraActual.get(Calendar.HOUR_OF_DAY);
 else
   hora = fechaHoraActual.get(Calendar.HOUR);
 return hora;
}

public int getMinutos()
{
 minutos = fechaHoraActual.get(Calendar.MINUTE);
 return minutos;
}

public String getFecha()
{
 return ( fechaHoraActual.get(Calendar.DAY_OF_MONTH) + "/" +
         (fechaHoraActual.get(Calendar.MONTH) + 1) + "/" +
          fechaHoraActual.get(Calendar.YEAR) );
}
}
