public class Planeta {

	private int vidas;
	private int misilesR;
	private String nombre;
	private int misilesP;
	private static int numeroequipos;
	private int defensa;

	public Planeta(String nombre, int i) {

		this.vidas = 200;
		this.misilesR = 0;
		this.misilesP = 50;
		this.nombre = nombre;

		numeroequipos++;
		System.out.println("Nombre introducido: " + nombre);
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {

		this.vidas = vidas;

	}

	public int getMisilesR() {
		return misilesR;
	}

	public void setMisilesR(int misilesR) {
		this.misilesR = misilesR;
	}

	public int getMisilesP() {
		return misilesP;
	}

	public void setMisilesP(int misilesP) {
		this.misilesP = misilesP;
	}

	public String getNombre() {

		return nombre;

	}

	public String setNombre(String nombre) {

		this.nombre = nombre;

		return nombre;

	}

	public int getNumeroequipos() {
		return numeroequipos;
	}

	public void setNumeroequipos(int numeroequipos) {
		Planeta.numeroequipos = numeroequipos;
	}

	public int lanzadera(int misileslanzadera) {

		misilesP = misileslanzadera;

		return misilesP;
	}

	public int mi(int misiles) {

		misilesR = misilesR + misiles;

		return misilesR;

	}

	public int def(int defen) {
		defensa = defen;
		return defensa;

	}

	public int calculo() {

		if (misilesR > defensa) {

			defensa = defensa - misilesR;
			vidas = vidas + defensa;

			defensa = 0;
			misilesR = 0;
			return vidas;
		}

		else if (misilesR <= defensa) {

			defensa = 0;
			misilesR = 0;
			return vidas;

		}
		System.out.println(misilesR + "ha dejado" + vidas);

		return vidas;
	}

}
