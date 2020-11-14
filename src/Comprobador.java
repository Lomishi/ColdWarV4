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

	public static int comprobarnumequipo() {
		int resultado = 0;
		boolean comprobado = false;
		String texto3;
		do {
			try {

				texto3 = teclado.nextLine();

				if (Integer.parseInt(texto3) < -1) {
					System.out.println("Dato Incorrecto. Introduce otro valor.");

				}

				else {
					resultado = Integer.parseInt(texto3);
					comprobado = true;
				}

			}

			catch (Exception e) {
				System.out.print("Hay que introducir un numero.");
			}

		} while (!comprobado);

		return resultado;
	}

	public static int comprobarmisilesSelect() {
		int resultado = 0;
		boolean comprobado = false;
		String texto4;
		do {
			try {

				texto4 = teclado.nextLine();

				if (Integer.parseInt(texto4) > 50 || Integer.parseInt(texto4) < 0) {
					System.out.println("Dato Incorrecto. Introduce otro valor.");

				}

				else {
					resultado = Integer.parseInt(texto4);
					comprobado = true;
				}

			}

			catch (Exception e) {
				System.out.print("Hay que introducir un numero.");
			}

		} while (!comprobado);

		return resultado;
	}

	public static int comprobarfinal() {
		int resultado = 0;
		boolean comprobado = false;
		String texto5;
		do {
			try {

				texto5 = teclado.nextLine();

				if (Integer.parseInt(texto5) != 1 && Integer.parseInt(texto5) != 2) {
					System.out.println("Dato Incorrecto. Introduce otro valor.");

				}

				else {
					resultado = Integer.parseInt(texto5);
					comprobado = true;
				}

			}

			catch (Exception e) {
				System.out.print("Hay que introducir un numero.");
			}

		} while (!comprobado);

		return resultado;
	}

	public static int ComprobarV(int a) {
		int resultado = 0;
		boolean comprobado = false;
		String texto;

		do {
			try {
				// Entramos el numero de equipos en el texto

				texto = teclado.nextLine();
				// parseint coje el String y devuelve el numero entero de la String
				// mientras sea mas pequeño que a (2)
				// comprobado se quedarà en false
				if (Integer.parseInt(texto) < a) {
					System.out.println("Dato Incorrecto. Introduce otro valor.");

				}

				// cuando entra aqui le decimos a menu que el valor de texto pasado a int es
				// igual resultado. y retornamos resultado
				else {
					resultado = Integer.parseInt(texto);
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
