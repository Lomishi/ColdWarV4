public class Planeta {

	private int vidas;
	private int misilesR;
	private String nombre;
	private static int numeroequipos;
	private int defensa;

	public Planeta(String nombre, int i) {

		this.vidas = 200;
		this.misilesR = 0;
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

	public String getNombre() {

		nombre = setNombre(nombre);

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
			
			return vidas;
		}

		else if (misilesR <= defensa) {
			
			return vidas;

		}

		return vidas;
	}

}