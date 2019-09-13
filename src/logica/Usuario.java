package logica;

import java.util.ArrayList;

public class Usuario {
	
	private int ci = 0; 
	private String nombre;
	private String apellido;
	private String mail;
	private String password;
	private ArrayList<Prestamo> prestamos;
	
	// M�todo para crear Usuario
	
	Usuario(int ci, String nombre, String apellido, String mail, String password){
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.password = password;
	}
	
	// Getters and Setters
	
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

}
