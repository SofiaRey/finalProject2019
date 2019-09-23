package logica;

public class Profesor extends Usuario {
	
	private Orientacion orientacion;
	
	// Constructor
	
	public Profesor(int id, int CI, String nombre, String apellido, String mail, String password, Orientacion orientacion) {
		super(id, CI, nombre, apellido, mail, password);
		this.orientacion = orientacion;
	}
	
	// Getters and Setters
	
	public Orientacion getOrientacion() {
		return orientacion;
	}
	public void setOrient(String orient) {
		this.orientacion = orientacion;
	}
}
