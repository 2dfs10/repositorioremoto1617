package pruebasunitarias;

public class MayorNumero {

	/**
	 * Devuelve el elemento de mayor valor de una lista
	 * 
	 * @param list
	 *            Un array de enteros
	 * @return El entero de mayor valor de la lista
	 */

	public static int obt_mayorNumero(int lista[]) {
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < lista.length; indice++) {
			if (lista[indice] > max) {
				max = lista[indice];
			}
		}
		return max;
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Pruebas 
		 * [3, 7, 9, 8] → 9;  caso normal
		 * [9, 7, 8] → 9;     al principio
		 * [7, 9, 8] → 9;     en medio
		 * [7, 8, 9] → 9;     al final
		 * [9, 7, 9, 8] → 9   se encuentra duplicado
		 *   [7] → 7          con un solo elemento
		 *   [-4, -6, -7, -22] → -4    compuesto por números negativos
		 */
		
		
		// System.out.println(MayorNumero.obt_mayorNumero(new int[] {-4,-8}));
		
	//}

}
