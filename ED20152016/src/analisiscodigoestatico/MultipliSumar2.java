package analisiscodigoestatico;

public class MultipliSumar2 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		int suma = 0, producto = 1;

		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			producto = producto * i;

		}
		System.out.println("valor de la suma " + suma);
		System.out.println("valor del producto " + producto);

	}

}
