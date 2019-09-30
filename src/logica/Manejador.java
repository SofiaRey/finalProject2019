package logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import persistencia.Conn;

public class Manejador {
	
	Conn connect = new Conn();
	Connection con = connect.conectarMySQL();
	Statement s;
	private ArrayList<Libro> libros;
	private ArrayList<Usuario> usuarios;
	private TipoUsuario tipoUsuario;
	private static AtomicLong id = new AtomicLong();
	
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
	
	// Actualizar Arrays con datos de la base de datos
	
//	public void actualizarArrays(ArrayList array) {
//		
//		ResultSet rs;
//		
//		try {
//			s = con.createStatement();
//			rs = s.executeQuery(" SELECT * FROM usuario");
//			
//			while (rs.next()) {
//				usuarios.add(rs.getString(2));
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	// Generar IDs
	
	public static String generarID(){
		
	    return String.valueOf(id.getAndIncrement());
	    
	}
	
	// Crear un Usuario
	
	 public void altaUsuario(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario tipoUsuario, Orientacion orientacion, int tope){
		
		// Agregar a tabla usuario
		try {
			s = con.createStatement();
			s.executeUpdate("INSERT INTO usuario (" + CI + ", " + id + ", \"" + nombre + "\", \"" + apellido + "\", \"" + mail + "\",  \"" + password + "\");");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Agregar a array de usuarios y a tabla profesor/estudiante/bibliotecario
		switch (tipoUsuario) {
		case PROFESOR:
			
			usuarios.add(new Profesor(id, CI, nombre, apellido, mail, password, orientacion));
			
			try {
				s.executeUpdate("INSERT INTO profesor (" + CI + ", \"" + orientacion + "\");");
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
			
		case ESTUDIANTE:
			
			usuarios.add(new Estudiante(id, CI, nombre, apellido, mail, password, orientacion, tope));
			
			try {
				s.executeUpdate("INSERT INTO estudiante (" + CI + ", \"" + orientacion + "\");");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case BIBLIOTECARIO:
			
			usuarios.add(new Bibliotecario(id, CI, nombre, apellido, mail, password));
			
			try {
				s.executeUpdate("INSERT INTO bibliotecario (" + CI + ");");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
	}
	
	// Seleccionar un usuario a partir de su id
		
	public Usuario traerUsuarioPorId(int id) {
		
		for (int i = 0; i < usuarios.size(); i++) {
			
			if( usuarios.get(i).getId() == id ) {
				
				return usuarios.get(i);
				
			}
		}
		return null;
				
	}
	
}
