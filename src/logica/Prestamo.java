package logica;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {

	private int id;
	private Date fechaSolicitado;
	private Date fechaDevolucion;
	private boolean devuelto;
	private Usuario usuario;
	private Libro libro;
	private ArrayList<Notificacion> notificaciones = new ArrayList<Notificacion>();

	// Constructor

	public Prestamo(int id, Date fechaSolicitado, Date fechaDevolucion, boolean devuelto, Usuario usuario,
			Libro libro) {
		this.id = id;
		this.fechaSolicitado = fechaSolicitado;
		this.fechaDevolucion = fechaDevolucion;
		this.devuelto = devuelto;
		this.usuario = usuario;
		this.libro = libro;

		usuario.agregarPrestamo(this);
		libro.agregarPrestamo(this);

		for (int i = 0; i < 3; i++) {
			Notificacion notificacion = new Notificacion(this.fechaSolicitado, fechaDevolucion, this);
			this.notificaciones.add(notificacion);
		}

	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaSolicitado() {
		return fechaSolicitado;
	}

	public void setFechaSolicitado(Date fechaSolicitado) {
		this.fechaSolicitado = fechaSolicitado;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public boolean isDevuelto() {
		return devuelto;
	}

	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}