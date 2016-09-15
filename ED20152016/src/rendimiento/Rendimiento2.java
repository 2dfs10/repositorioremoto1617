package rendimiento;

import java.util.*;

public class Rendimiento2 {

	static Scanner lectura = new Scanner(System.in);
	static int[] Arreglo;
	static int aux;
	static int longitud;

	public static void Burbuja() {
		// Ordenar los Numeros utilizando el metodo Burbuja
		for (int i = 0; i < longitud - 1; i++)
			for (int j = i + 1; j < longitud; j++)
				if (Arreglo[j] < Arreglo[i]) {
					// Intercambiar los valores
					aux = Arreglo[j];
					Arreglo[j] = Arreglo[i];
					Arreglo[i] = aux;
				}

	}

	public static void Quicksort(int arr[], int p, int r) {
		if (p < r) {
			int q = Particion(arr, p, r);
			Quicksort(arr, p, q - 1);
			Quicksort(arr, q + 1, r);
		}
	}

	static int Particion(int arr[], int p, int r) {
		int x = arr[r];
		int i = p - 1, t;
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				i++;
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		t = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = t;
		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("\t\tBURBUJA : ");
		// longitud del arreglo
		System.out.print("Ingrese la Cantidad Numeros : ");
		longitud = lectura.nextInt();

		// Creando un arreglo de tamaño longitud
		Arreglo = new int[longitud];

		// Leer todos los numero a ordenar
		System.out.println("Ingresar   - " + longitud + " -  Numeros : ");
		for (int i = 0; i < longitud; i++) {

			Arreglo[i] = (int) (Math.random() * 1000);
		}
		long tiempoInicio = System.currentTimeMillis();

		Burbuja();
		//Quicksort(Arreglo, 0, longitud - 1);

		long totalTiempo = (System.currentTimeMillis() - tiempoInicio);
		System.out.println("El tiempo de demora es :" + totalTiempo
				+ " miliseg");
		System.out.println("Saliendo");
		// Mostra el arreglo ordenado
		 //for (int i = 0; i < longitud; i++)
		 //System.out.print(Arreglo[i] + " ");

	}

}
