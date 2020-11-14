import java.util.ArrayList;
import java.util.Scanner;

public class Partida {
	Scanner teclado = new Scanner(System.in);
	int numeroE;
	String nombre;
	// array para guardar los equipos
	ArrayList<Planeta> arrayplanetas = new ArrayList<Planeta>();
	// ARRAY para el listado de operaciones
	ArrayList<String> arrayoperaciones = new ArrayList<String>();
	// int que guarda el numero de equiposvivos
	int equiposVivos;
	int rondas = 0;

	void iniciarpartida() {
		fabricaEquipos();

		while (comprobarequiposvivos()) {
			rondas();
		}
	}

	public void fabricaEquipos() {
		boolean comprobarName;

		System.out.println("¿Cuántos equipos quieres crear?");
		// Utilizamos esa clase para introducir el numero y comprobar que no se
		// introduzcan letras o valores superiores a los introducidos entre parentesis
		// 2,10 se lo pasamos a las variables a,b.
		numeroE = Comprobador.ComprobarV(3);

		// Bucle para crear equipos
		for (int i = 1; i <= numeroE; i++) {
			// Aqui introducimos el nombre del equipo

			do {
				System.out.println("Introduce nombre del equipo :" + i);
				nombre = teclado.nextLine();
				// Aqui decimos que la variable boolean comprobarname es = a el boolean del
				// metodo
				comprobarName = comprobarN(nombre);

				// Si es true se crea el equipo

				if (comprobarName == true) {
					Planeta equipo = new Planeta(nombre, i);
					arrayplanetas.add(equipo);

					// Si es false se repite el bucle do while.
				} else
					System.out.println("Escribe un nombre que no haya sido introducido");
			} while (comprobarName == false);
		}
		equiposVivos = arrayplanetas.size();

		// abrimos mostrar1

	}

	public void rondas() {

		rondas++;

		System.out.println("<<<RONDA " + rondas + ">>>");

		for (int e = 0; e < arrayplanetas.size(); e++) {
			System.out.println(arrayplanetas.get(e).getNombre() + " con " + arrayplanetas.get(e).getVidas());

		}

		// FOR PARA RECORRER LOS EQUIPOS
		for (int i = 0; i < arrayplanetas.size(); i++) {

			System.out.println("Turno del equipo " + arrayplanetas.get(i).getNombre());

			System.out.println("-------------------------------------");

			for (int e = 0; e < arrayplanetas.size(); e++) {

				if (e != i) {
					System.out.println("[" + e + "]" + arrayplanetas.get(e).getNombre());
				}

			}

			System.out.println("[-1] Misiles restantes a defensa");
			int misiles = 50;
			arrayplanetas.get(i).lanzadera(misiles);
			int defensa = 0;
			// for de los datos de defensa y ataque
			for (int m = 1; m > 0; m--) {

				int misileselect = 0;
				int equipo = 0;
				System.out.println("Misiles disponibles: " + arrayplanetas.get(i).getMisilesP());

				do {
					System.out.println("¿A quien quieres atacar?");
					equipo = Comprobador.comprobarnumequipo();
					if (equipo == i || equipo >= arrayplanetas.size() || equipo < -1) {
						System.out.println(" Datos erroneos. Vuelve a introducir.");
					}
				} while (equipo == i || equipo >= arrayplanetas.size() || equipo < -1);

				// DEFENSA
				if (equipo == -1) {
					defensa = arrayplanetas.get(i).getMisilesP() / 2;

					m = defensa * 2 - arrayplanetas.get(i).getMisilesP() - 1;
					System.out.println("Defensa " + defensa);
				}
				// ATAQUE
				else {
					do {
						System.out.println("Introduce el número de misiles con el que quieres atacar.");
						misileselect = Comprobador.comprobarmisilesSelect();
						if (misileselect > 50 || misileselect < 0
								|| misileselect > arrayplanetas.get(i).getMisilesP()) {
							System.out.println(
									"Datos mal introducidos (Has introducido mas misiles de los que tienes o una cifra extraña.)");
						}

					} while (misileselect > 50 || misileselect < 0
							|| misileselect > arrayplanetas.get(i).getMisilesP());

					misiles = misiles - misileselect;
					arrayplanetas.get(i).lanzadera(misiles);
					m = arrayplanetas.get(i).getMisilesP();
				}
				if (misileselect == 50) {
					m = m + 1;
				}

				if (equipo != -1) {

					arrayplanetas.get(equipo).mi(misileselect);

					arrayoperaciones.add("\n El equipo " + arrayplanetas.get(i).getNombre() + " ataca a "
							+ arrayplanetas.get(equipo).getNombre() + " con " + misileselect + " misiles.\n");
				} else {

					arrayplanetas.get(i).def(defensa);

					arrayoperaciones.add(
							"\n El equipo " + arrayplanetas.get(i).getNombre() + " se defiende con " + defensa + "\n");

				}

			}

		}
		// for para restar vidas
		for (int i = 0; i < arrayplanetas.size(); i++) {

			arrayplanetas.get(i).calculo();
			comprobarequiposvivos();

		}

		System.out.print(arrayoperaciones);
		System.out.println("");
	}

	// Metodo para comprobar
	public boolean comprobarN(String nombre) {

		boolean compr = true;
		// Aqui capamos que introduzca un valor nada.
		if (nombre.equals(""))
			compr = false;
		else {

			for (Planeta equip : arrayplanetas) {
				if (equip.getNombre().equals(nombre))
					compr = false;
			}
		}
		// si a entrado en algun if retornara falso. si no a entrado en ninguno es que
		// todo es correcto y retornara true.
		return compr;
	}

	// funcion boolean para comprobar los equipos vivos y quitar los muertos.
	// false se acba el bucle, true continua
	public boolean comprobarequiposvivos() {
		int vivos = arrayplanetas.size();
		int muertos = 0;

		for (Planeta planetas : arrayplanetas) {
			if (planetas.getVidas() > 0) {

			} else
				muertos++;
		}

		// si solo queda un jugador vivo good
		if (equiposVivos == 1) {
			System.out.println("El Planeta: " + arrayplanetas.get(0).getNombre() + " ha ganado.");
			// al retornar falso se acaba el bucle de ronda
			return false;

		}

		// si hay los mismos jugadores vivos que muerto se queda en empate
		else if (vivos == muertos) {

			System.out.println("Empate!");
			for (Planeta planetas : arrayplanetas) {
				System.out.println(planetas.getNombre());
			}
			// al retornar falso se acaba el bucle de ronda
			return false;

		}

		for (int i = 0; i < arrayplanetas.size(); i++) {

			// eliminamos a el jugador que tenga 0 vidas o menos

			if (arrayplanetas.get(i).getVidas() <= 0) {
				equiposVivos--;
				System.out.println("El Planeta: " + arrayplanetas.get(i).getNombre() + " ha sido destruido.");
				arrayplanetas.remove(i);
				i = i - 1;
			}
		}

		// Revisamos si queda jugador vivo de nuveo por si aca
		if (equiposVivos == 1) {

			victory(arrayplanetas.get(0).getNombre());
			// al retornar falso se acaba el bucle de ronda
			return false;
		}

		return true;

	}

	// Metodo que printa el ganador
	public void victory(String vencedor) {
		System.out.println("El Planeta: " + vencedor + " ha ganado. ¡ Felicitaciones");
		int seleccionador;

		/*
		 * do { System.out.println(" Para regresar pulsa 1");
		 * System.out.println(" Para salir pulsa 2"); seleccionador=
		 * comprobar.comprobarfinal(); if(seleccionador !=1 && seleccionador !=2) {
		 * System.out.println(" Introduce 1 o 2"); } }while(seleccionador !=1 &&
		 * seleccionador !=2);
		 */
	}

}
