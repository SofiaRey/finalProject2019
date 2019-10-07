package logica;

import java.util.Date;

public class Notificacion {
	
	private Date fechaSolicitado;
	private Date fechaDevolucion;
	private Prestamo prestamo;
	private Libro libro;
	
	// Constructor
	
	public Notificacion(Date fechaSolicitado, Date fechaDevolucion, Prestamo prestamo) {
		super();
		this.fechaSolicitado = fechaSolicitado;
		this.fechaDevolucion = fechaDevolucion;
		this.prestamo = prestamo;
	}
	
	// Getters and Setters
	
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
}
