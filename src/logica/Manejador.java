package logica;

import java.util.ArrayList;

public class Manejador {
	
	private ArrayList<Libro> libros;
	private ArrayList<Usuario> usuarios;
	private TipoUsuario tipoUsuario;
	
	// Constructor
	
	public Manejador(ArrayList<Libro> libros, ArrayList<Usuario> usuarios) {
		super();
		this.libros = libros;
		this.usuarios = usuarios;
	}
	
	// Getters and Setters

	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	// Crear un Usuario
	
	/*
	* public Usuario altaUsuario() {
	*	
	*	switch (tipoUsuario) {
	*	case PROFESOR:
	*		
	*		break;
	*	case ESTUDIANTE:
	*		
	*		break;
	*	case BIBLIOTECARIO:
	*		
	*		break;
	*	}
	*	
	*}
	*/
}
