package logica;

public class Estudiante extends Usuario {

	private Orientacion orientacion;
	private int tope;

	// Constructor

	Estudiante(int id, int CI, String nombre, String apellido, String mail, String password, Orientacion orientacion,
			int tope) {
		super(id, CI, nombre, apellido, mail, password);
		this.orientacion = orientacion;
		this.tope = tope;
	}

	// Getters and Setters

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}
}
