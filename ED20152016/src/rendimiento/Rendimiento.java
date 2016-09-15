package rendimiento;

//import java.util.*;
public class Rendimiento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long tiempoInicio = System.currentTimeMillis();
			// cambiar i a long , double, float y ver resultados
		for (long i=1;i<10000000;i++)
			{
			
				int suma=0;
				long tiempo = System.currentTimeMillis();
			}
			long totalTiempo = (System.currentTimeMillis() - tiempoInicio);
			
			System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
			System.out.println("Saliendo");
	}

}
