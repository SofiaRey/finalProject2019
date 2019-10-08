package logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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

	public void actualizarArrays(ArrayList array) {

		ResultSet rs;

		try {
			s = con.createStatement();
			rs = s.executeQuery(" SELECT * FROM usuario");

			while (rs.next()) {
				Usuario user = new Usuario(rs.getInt("id"), rs.getInt("CI"), rs.getString("nombre"),
						rs.getString("apellido"), rs.getString("mail"), rs.getString("password"));
				array.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Generar IDs

	public static String generarID() {

		return String.valueOf(id.getAndIncrement());

	}

	// Crear un Usuario

	public void altaUsuario(int id, int CI, String nombre, String apellido, String mail, String password,
			TipoUsuario tipoUsuario, Orientacion orientacion, int tope) {

		// Agregar a tabla usuario
		try {
			s = con.createStatement();
			s.executeUpdate("INSERT INTO usuario(CI, id, nombre, apellido, mail, password) values(" + CI + ", " + id
					+ ", \"" + nombre + "\", \"" + apellido + "\", \"" + mail + "\",  \"" + password + "\");");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Agregar a tabla profesor/estudiante/bibliotecario
		switch (tipoUsuario) {
		case PROFESOR:

			usuarios.add(new Profesor(id, CI, nombre, apellido, mail, password, orientacion));

			try {
				s.executeUpdate("INSERT INTO profesor(CI, orientacion) values(" + CI + ", \"" + orientacion + "\");");
			} catch (Exception e) {
			}
			break;

		case ESTUDIANTE:

			usuarios.add(new Estudiante(id, CI, nombre, apellido, mail, password, orientacion, tope));

			try {
				s.executeUpdate("INSERT INTO estudiante(CI, orientacion) values(" + CI + ", \"" + orientacion + "\");");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;

		case BIBLIOTECARIO:

			usuarios.add(new Bibliotecario(id, CI, nombre, apellido, mail, password));

			try {
				s.executeUpdate("INSERT INTO bibliotecario(CI) values(" + CI + ");");
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

			if (usuarios.get(i).getId() == id) {

				return usuarios.get(i);

			}
		}
		return null;

	}

	// Modificar Usuario

	public void modificarUsuario(int CI, String nombre, String apellido, String mail, String password,
			TipoUsuario tipoUsuario, Orientacion orientacion, int tope) {

		// Actualizar tabla usuario
		try {
			s = con.createStatement();
			s.executeUpdate("update usuario(CI, id, nombre, apellido, mail, password) set nombre = \"" + nombre
					+ "\", apellido = \"" + apellido + "\", mail = \"" + mail + "\", password =  \"" + password
					+ "\" where Usuario.CI = " + CI + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Actualizar array de usuarios con datos nuevos
		actualizarArrays(usuarios);

	}

	// Listar usuarios

	public ArrayList listarUsuarios() {

		return usuarios;

	}

	// Dar de alta prestamos

	public void altaPrestamo(int id, Date fechaSolicitado, Date fechaDevolucion, Usuario usuario, Libro libro) {
		// Agregar a tabla usuario
		// Revisar base de datos, hay dos ids para libro pero se conecta con una sola
		// las dos tablas
		if (libro.isHayEjemplarDisponible()) {
			try {
				s = con.createStatement();
				s.executeUpdate("INSERT INTO prestamo(devuelto, fechaDev, FechaSol, ciUsario, idLibro) values(" + 0
						+ ", \"" + fechaDevolucion + "\", \"" + fechaSolicitado + "\", \"" + usuario.getCI() + "\",  \""
						+ libro.getAniCode() + "\");");
				new Prestamo(id, fechaSolicitado, fechaDevolucion, false, usuario, libro);
				if (libro.getCantEjemplaresDisp() > 0) {
					libro.setCantEjemplaresDisp(libro.getCantEjemplaresDisp() - 1);
					if (libro.getCantEjemplaresDisp() < 1) {
						libro.setHayEjemplarDisponible(false);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// Listar todos los prestamos del sistema

	public ArrayList<Prestamo> listarPrestamos() {

		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

		for (int i = 0; i < usuarios.size(); i++) {

			// Concatena cada una de las arrays de prestamos de cada uno de los usuarios en
			// una sola
			prestamos.addAll(usuarios.get(i).getPrestamos());

		}

		return prestamos;
	}

	// Dar de alta un libro

	public void altaLibro(String aniCode, String autor, Date fechaPubl, int nroEdicion, String editorial,
			String descripcion, int cantEjemplares, boolean hayEjemplarDisponible, String codigoISBN, String genero,
			String imagUrl) {

		// Agregar a tabla libro
		try {
			s = con.createStatement();
			s.executeUpdate(
					"INSERT INTO libro(CodLibro, CodISBN, genero, autor, añoPub, descripcion, editorial, URLcover, cant, disponible) values("
							+ aniCode + ", " + codigoISBN + ", \"" + genero + "\", \"" + autor + "\", " + fechaPubl
							+ ", \"" + descripcion + "\", \"" + editorial + "\", \"" + imagUrl + "\", " + cantEjemplares
							+ ", " + hayEjemplarDisponible + ");");
			libros.add(new Libro(aniCode, autor, fechaPubl, nroEdicion, editorial, descripcion, cantEjemplares,
					hayEjemplarDisponible, codigoISBN, genero, imagUrl));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Listar libros

	public ArrayList listarLibros() {

		return libros;

	}

	// Dar de baja un prestamo

	public void bajaPrestamo(Prestamo prestamo) {

		try {
			s = con.createStatement();
			s.executeUpdate("update prestamo devuelto = 1 where prestamo.id = " + prestamo.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
