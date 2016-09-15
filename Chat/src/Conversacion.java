

public class Conversacion
{
  private static final int NMENSAJES = 50;
  private static String[] conversaci�n = new String[NMENSAJES];
  
  static
  {
    // Iniciar la matriz s�lo la primera vez
    for (int i = 0; i < NMENSAJES; ++i)
      conversaci�n[i] = "";
  }
  
  public synchronized static void a�adirMensaje(String mensaje)
  {
    // Conservar en una pila los NMENSAJES �ltimos
    int i;
    // A�adir el �ltimo mensaje
    for (i = 0; i < NMENSAJES - 1; ++i)
      conversaci�n[i] = conversaci�n[i+1];
    conversaci�n[i] = mensaje; // �ltimo mensaje recibido
  }
  
  public synchronized static String[] obtenerConversacion()
  {
    return conversaci�n;
  }
}
