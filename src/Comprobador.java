import java.util.Scanner;

public class Comprobador {
	static Scanner teclado = new Scanner(System.in);

	public static int comprobaropcion() {
		int resultado = 0;
		boolean comprobado = false;
		String texto1;
		do {
			try {

				// Entramos el numero de equipos en el texto

				texto1 = teclado.nextLine();
				// parseint coje el String y devuelve el numero entero de la String
				// comprobado se quedarà en false
				if (Integer.parseInt(texto1) < 1 || Integer.parseInt(texto1) > 5) {
					System.out.println("Dato Incorrecto. Introduce otro valor.");

				}

				// cuando entra aqui le decimos a menu que el valor de texto pasado a int es
				// igual resultado. y retornamos resultado
				else {
					resultado = Integer.parseInt(texto1);
					comprobado = true;
				}

			}

			// Cualquier valor introducido que no entre en lo anterior pasara aqui.
			catch (Exception e) {
				System.out.print("Hay que introducir un numero.");
			}

			// el bucle se reproducira mientras comprobado siga siendo false
		} while (!comprobado);

		return resultado;
	}

	public static int comprobaropcionvolver() {
		int resultado = 0;
		boolean comprobado = false;
		String texto2;
		do {
			try {

				// Entramos el numero de equipos en el texto

				texto2 = teclado.nextLine();
				// parseint coje el String y devuelve el numero entero de la String
				// comprobado se quedarà en false
				if (Integer.parseInt(texto2) != 1) {
					System.out.println("Dato Incorrecto. Introduce otro valor.");

				}

				// cuando entra aqui le decimos a menu que el valor de texto pasado a int es
				// igual resultado. y retornamos resultado
				else {
					resultado = Integer.parseInt(texto2);
					comprobado = true;
				}

			}

			// Cualquier valor introducido que no entre en lo anterior pasara aqui.
			catch (Exception e) {
				System.out.print("Hay que introducir un numero.");
			}

			// el bucle se reproducira mientras comprobado siga siendo false
		} while (!comprobado);

		return resultado;
	}

}
