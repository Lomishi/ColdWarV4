import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		menuOpcions();

	}

	//////////////////////////////////////////////////////////////////////////////////////////// MENU
	//////////////////////////////////////////////////////////////////////////////////////////// OPCIONS
	//////////////////////////////////////////////////////////////////////////////////////////// ///////////////////////////////////////
	public static void menuOpcions() {
		Scanner teclado = new Scanner(System.in);

		int opcion;
		opcion = 0;
		System.out.println("===BIENVENIDOS AL SALON DE JUEGO ===");
		System.out.println("");
		System.out.println("[ 1 ] ==> Jugar");
		System.out.println("[ 2 ] ==> REGLAS DEL JUEGO");
		System.out.println("[ 3 ] ==> INFORMACIÓN");
		System.out.println("[ 4 ] ==> APARTADO ABIERTO");
		System.out.println("[ 5 ] ==> Sortir");
		System.out.println("");

		opcion = Comprobador.comprobaropcion();

		if ((opcion < 1) || (opcion > 5)) {
			error();
			System.out.println("ERROR");
			menuOpcions();
		} else {
			Opciones(opcion);
		}

	}

	/////////////////////////////////////////// opcion////////////////////////////////////////////////////////
	public static void Opciones(int numOpcion) {

		try {
			switch (numOpcion) {
			case 1:
				jugar();
				break;

			case 2:
				Reglasdeljuego();
				break;

			case 3:
				info();
				break;

			case 4:

				apartadoopcional();

				break;

			case 5:
				System.out.println("Adios master.");

				break;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR");
		}

	}

///////////////////////////////////////////JUGAR////////////////////////////////////////////////////////
	public static void jugar() {

		new Partida().iniciarpartida();

	}

///////////////////////////////////////////REGLAS////////////////////////////////////////////////////////
	public static void Reglasdeljuego() {
		System.out.println("Jugarás un bloque de naciones: el bloque soviético, el bloque occidental o el bloque no");
		System.out.println("alineado. Cada bloque se considera un enemigo entre sí, incluso si los jugadores deciden ");
		System.out.println("cooperar temporalmente para preservar el equilibrio de poder. Cada uno de los Bloques ");
		System.out.println("puede ser jugado por una o dos personas, dependiendo del número de jugadores. ");
		System.out.println(" ");
		System.out.println(
				"En su turno, jugará a las cartas para desarrollar una narrativa de la Guerra Fría, como podría ");
		System.out.println(
				"haber sido. Puedes decidir usar la fuerza militar cuando falla el espionaje, ¡pero el aumento de ");
		System.out.println(
				"las tensiones reducirá la penalización que pagan tus enemigos por usar sus armas de destrucción masiva como represalia!");
		System.out.println("");
		System.out.println("volver pulsa 1.");
		Scanner teclado = new Scanner(System.in);
		int start = 0;
		start = Comprobador.comprobaropcionvolver();

		if (start == 1) {
			menuOpcions();
		}
		;

	}

///////////////////////////////////////////INFO////////////////////////////////////////////////////////
	public static void info() {
		System.out.println("Muestra información sobre:");
		System.out.println("- Versión 1.1");
		System.out.println("- Contacto(e-mail) fonsilander@gmail.com");
		System.out.println("- Autor Jordi Colell y Juanma Lozano");
		System.out.println("");
		System.out.println("volver pulsa 1.");
		Scanner teclado = new Scanner(System.in);
		int start = 0;
		start = Comprobador.comprobaropcionvolver();

		if (start == 1) {
			menuOpcions();
		}
		;

	}

///////////////////////////////////////////apartadoopcional////////////////////////////////////////////////////////
	public static void apartadoopcional() {

		System.out.println("Escrito 03/11/2020 1 hora antes de la entrega. ");
		System.out.println("Teniamos pensado introducir aquí algo mas interessante.");
		System.out.println(
				"Pero nuestra organizacion del tiempo, errores, mas errores(y es posible que haya mas que no hemos visto) , ");
		System.out.println("empezar otra vez el programa, y otros temas mas psicologicos no nos han dejado.");
		System.out.println(" ");
		System.out.println(
				"Simplemente quiero que veas el programa de dos xavales que hace medio año les tenian que ayudar para hacer el programa y");
		System.out.println("han conseguido solos hacer que este programa minimamente funcione. ");
		System.out.println(" ");
		System.out.println("Intentaremos la proxima vez llegar a todo, y al tiempo previsto.");

		System.out.println("");
		System.out.println("volver pulsa 1.");
		Scanner teclado = new Scanner(System.in);
		int start = 0;
		start = Comprobador.comprobaropcionvolver();

		if (start == 1) {
			menuOpcions();
		}
		;

	}

///////////////////////////////////////////ERROR////////////////////////////////////////////////////////
	public static void error() {
		System.out.println("Error, operacio incorrecta");
		System.out.println("");
	}
}