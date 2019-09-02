package logica;

public class Profesor extends Usuario {
	private String orient;
	
	// Constructor de Profesor
	
	public Profesor(String orient, int ci, String nombre, String apellido, String mail, String password) {
		super(ci, nombre, apellido, mail, password);
		this.orient = orient;
	}
	
	// Getters and Setters
	
	public String getOrient() {
		return orient;
	}

	public void setOrient(String orient) {
		this.orient = orient;
	}
}
