package logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import persistencia.Conn;

// Generar las ids desde las propias clases esta correcto?

public class Manejador {

	Conn connect = new Conn();
	Connection con = connect.conectarMySQL();
	Statement s;
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private static final Manejador unicaInstancia = new Manejador();

	// Constructor

	private Manejador() {
		actualizarArrays("libros");
		actualizarArrays("usuarios");
	}

	// Retorna instancia de Manejador

	public static Manejador devolverInstancia() {
		return unicaInstancia;
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

	public void actualizarArrays(String arrayName) {

		ResultSet rs;

		switch (arrayName) {
		case "libros":
			try {
				libros.clear();
				s = con.createStatement();
				rs = s.executeQuery("SELECT * FROM libro");

				while (rs.next()) {
					Libro libro = new Libro(rs.getString("CodLibro"), rs.getString("titulo"), rs.getString("autor"),
							rs.getInt("añoPub"), rs.getInt("nroEdicion"), rs.getString("editorial"),
							rs.getString("descripcion"), rs.getInt("cant"), rs.getInt("cantEjemplaresDisp"),
							rs.getBoolean("hayEjemplaresDisp"), rs.getString("CodISBN"), rs.getString("genero"),
							rs.getString("URLcover"));
					libros.add(libro);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;

		case "usuarios":
			try {
				usuarios.clear();
				s = con.createStatement();
				Statement sPres = con.createStatement();
				rs = s.executeQuery("SELECT * FROM usuario");
				ResultSet rsPrestamo;
				Usuario user = null;
				while (rs.next()) {
					rsPrestamo = sPres
							.executeQuery("SELECT * FROM Prestamo WHERE idUsuario = " + rs.getInt("id") + ";");
					user = new Usuario(rs.getInt("id"), rs.getInt("CI"), rs.getString("nombre"),
							rs.getString("apellido"), rs.getString("mail"), rs.getString("password"));
					usuarios.add(user);
					while (rsPrestamo.next()) {
						Libro libroPrestamo = traerLibroPorCodigo(rsPrestamo.getString("idLibro"));
						new Prestamo(rsPrestamo.getInt("id"), rsPrestamo.getDate("fechaSol"),
								rsPrestamo.getDate("fechaDev"), rsPrestamo.getBoolean("devuelto"), user, libroPrestamo);
					}
				}
				usuarios.add(user);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}

	}

	// Generar IDs

	public int generarID(String obj) {
		ResultSet rs;
		int id = 0;
		switch (obj) {
		case "usuario":
			try {
				s = con.createStatement();
				rs = s.executeQuery("SELECT MAX(u.id) as 'id' FROM usuario u");
				if (rs.next()) {
					id = rs.getInt("id");
					id = id + 1;
				} else {
					id = 1;
				}
				return id;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;

		case "prestamo":
			try {
				s = con.createStatement();
				rs = s.executeQuery("SELECT MAX(p.id) as 'id' FROM prestamo p");
				if (rs.next()) {
					id = rs.getInt("id");
					id = id + 1;
				} else {
					id = 1;
				}
				return id;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}
		return 0;
	}

	// Comparar cedula con contraseña para permitir ingreso

	public Boolean ingreso(int CI, String contrasena) throws Exception {

		Usuario usuario = traerUsuarioPorCI(CI);
		boolean isBibliotecario = false;
		ResultSet rs;
		try {
			s = con.createStatement();
			rs = s.executeQuery("SELECT * FROM bibliotecario WHERE id =" + usuario.getId() + ";");
			if (rs.next()) {
				isBibliotecario = true;
			}
			
			if (isBibliotecario) {
				for (int i = 0; i < usuarios.size(); i++) {

					if (usuarios.get(i).getCI() == CI && usuarios.get(i).getPassword().equals(contrasena)) {

						return true;
					}
				}
			} else {

				throw new Exception();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	// Crear un Usuario

	public void altaUsuario(int CI, String nombre, String apellido, String mail, String password,
			TipoUsuario tipoUsuario, Orientacion orientacion) throws Exception {
		int id = generarID("usuario");
		int tope = 0;
		// Agregar a tabla usuario
		try {
			s = con.createStatement();
			s.executeUpdate("INSERT INTO usuario(CI, id, nombre, apellido, mail, password) values(" + CI + ", " + id
					+ ", '" + nombre + "', '" + apellido + "', '" + mail + "',  '" + password + "');");
		} catch (SQLException e) {
			throw new Exception();
		}

		// Agregar a tabla profesor/estudiante/bibliotecario
		switch (tipoUsuario) {
		case PROFESOR:

			usuarios.add(new Profesor(id, CI, nombre, apellido, mail, password, orientacion));

			try {
				s.executeUpdate("INSERT INTO profesor(id, orientacion) values(" + id + ", '" + orientacion + "');");
			} catch (Exception e) {
				throw new Exception();
			}
			break;

		case ESTUDIANTE:

			usuarios.add(new Estudiante(id, id, nombre, apellido, mail, password, orientacion, 0));

			try {
				s.executeUpdate("INSERT INTO estudiante(id, orientacion, tope) values(" + id + ", '" + orientacion
						+ "', " + tope + ");");
			} catch (SQLException e) {
				throw new Exception();
			}
			break;

		case BIBLIOTECARIO:

			usuarios.add(new Bibliotecario(id, CI, nombre, apellido, mail, password));

			try {
				s.executeUpdate("INSERT INTO bibliotecario(id) values(" + id + ");");
			} catch (SQLException e) {
				throw new Exception();
			}
			break;
		}

	}

	// Seleccionar un usuario a partir de su id

	public Usuario traerUsuarioPorCI(int CI) {

		for (int i = 0; i < usuarios.size(); i++) {

			if (usuarios.get(i).getCI() == CI) {

				return usuarios.get(i);

			}
		}
		return null;

	}

	// Modificar Usuario

	public void modificarUsuario(int CI, String nombre, String apellido, String mail, String password,
			TipoUsuario tipoUsuario, Orientacion orientacion) {

		// Actualizar tabla usuario
		try {
			s = con.createStatement();
			s.executeUpdate("update usuario set nombre = '" + nombre + "', apellido = '" + apellido + "', mail = '"
					+ mail + "' where Usuario.CI = " + CI + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Actualizar array de usuarios con datos nuevos
		actualizarArrays("usuarios");

	}

	// Listar usuarios

	public ArrayList<Usuario> listarUsuarios() {

		return usuarios;

	}

	// Dar de alta prestamos

	public void altaPrestamo(Date fechaSolicitado, Date fechaDevolucion, Usuario usuario, Libro libro)
			throws Exception {

		// Actualizar el tope (cantidad de prestamos activos) + 1
		boolean isStudent = false;
		ResultSet rs;
		s = con.createStatement();
		rs = s.executeQuery("SELECT * FROM estudiante WHERE id =" + usuario.getId() + ";");
		if (rs.next()) {
			isStudent = true;
		}
		// Termina la funcion si el usuario es Estudiante y tiene ya 2 prestamos activos
		if (isStudent && rs.getInt("tope") == 2) {
			throw new Exception("Tope alcanzado");
		}

		int id = generarID("prestamo");
		// Agregar a tabla usuario
		if (libro.isHayEjemplarDisponible()) {

			try {
				s = con.createStatement();
				java.sql.Date sqlDateSol = new java.sql.Date(fechaSolicitado.getTime());
				java.sql.Date sqlDateDev = new java.sql.Date(fechaDevolucion.getTime());

				s.executeUpdate("INSERT INTO prestamo(id, devuelto, fechaDev, FechaSol, idUsuario, idLibro) values("
						+ id + ", " + 0 + ", \"" + sqlDateDev + "\", \"" + sqlDateSol + "\", \"" + usuario.getId()
						+ "\",  \"" + libro.getAniCode() + "\");");
				new Prestamo(id, fechaSolicitado, fechaDevolucion, false, usuario, libro);

				if (libro.getCantEjemplaresDisp() > 0) {
					if (isStudent) {
						int newTope = rs.getInt("tope") + 1;
						s.executeUpdate("UPDATE estudiante SET tope = " + newTope + ";");
					}
					libro.setCantEjemplaresDisp(libro.getCantEjemplaresDisp() - 1);

					// Subir los cambios a la base de datos
					s.executeUpdate("UPDATE Libro SET cantEjemplaresDisp = " + libro.getCantEjemplaresDisp()
							+ " WHERE CodLibro ='" + libro.getAniCode() + "';");

					if (libro.getCantEjemplaresDisp() == 0) {

						libro.setHayEjemplarDisponible(false);

						// Subir los cambios a la base de datos
						s.executeUpdate("update libro set hayEjemplaresDisp = " + libro.isHayEjemplarDisponible()
								+ " where CodLibro ='" + libro.getAniCode() + "';");
					}
					actualizarArrays("libros");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception();
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

	public void altaLibro(String aniCode, String titulo, String autor, int anoPub, int nroEdicion, String editorial,
			String descripcion, int cantEjemplares, boolean hayEjemplarDisponible, String codigoISBN, String genero,
			String imagUrl) throws Exception {

		// Agregar a tabla libro
		try {
			s = con.createStatement();
			s.executeUpdate(
					"INSERT INTO libro(titulo, CodLibro, CodISBN, nroEdicion, genero, autor, añoPub, descripcion, editorial, URLcover, cant, hayEjemplaresDisp, cantEjemplaresDisp) values('"
							+ titulo + "', '" + aniCode + "', '" + codigoISBN + "', " + nroEdicion + ", '" + genero
							+ "', '" + autor + "', " + anoPub + ", '" + descripcion + "', '" + editorial + "', '"
							+ imagUrl + "', " + cantEjemplares + ", " + hayEjemplarDisponible + ", " + cantEjemplares
							+ ");");
			libros.add(new Libro(aniCode, titulo, autor, anoPub, nroEdicion, editorial, descripcion, cantEjemplares,
					cantEjemplares, hayEjemplarDisponible, codigoISBN, genero, imagUrl));
		} catch (SQLException e) {
			throw new Exception();
		}

	}

	// Listar libros

	public ArrayList<Libro> listarLibros() {

		return libros;

	}

	// Traer libro por su codigo Anima

	public Libro traerLibroPorCodigo(String aniCode) {

		for (int i = 0; i < libros.size(); i++) {

			if (libros.get(i).getAniCode().equals(aniCode)) {

				return libros.get(i);

			}
		}
		return null;
	}

	// Dar de baja un prestamo

	public void bajaPrestamo(Prestamo prestamo) {

		try {
			s = con.createStatement();
			s.executeUpdate("update prestamo set devuelto = 1 where prestamo.id = " + prestamo.getId() + ";");
			// SI el usuario es estudiante se le debe de bajar 1 en el tope (prestamos
			// activos)
			boolean isStudent = false;
			ResultSet rs;
			Statement sUsu = con.createStatement();
			rs = sUsu.executeQuery("SELECT * FROM estudiante WHERE id =" + prestamo.getUsuario().getId() + ";");
			if (rs.next()) {
				isStudent = true;
				int newTope = rs.getInt("tope") - 1;
				s.executeUpdate("UPDATE estudiante SET tope = " + newTope + " WHERE id = "
						+ prestamo.getUsuario().getId() + ";");
				actualizarArrays("usuarios");
			}
			actualizarArrays("prestamos");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Prestamo traerPrestamoPorId(int id) {

		for (int i = 0; i < listarPrestamos().size(); i++) {

			if (listarPrestamos().get(i).getId() == id) {

				return listarPrestamos().get(i);

			}
		}

		return null;
	}
}
