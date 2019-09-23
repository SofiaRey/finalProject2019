package logica;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {

	private int id;
	private Date fechaSolicitado;
	private Date fechaDevolucion;
	private boolean devuelto;
	private Usuario usuario;
	private ArrayList<Notificacion> notificaciones;
	
	// Constructor
	
	public Prestamo(int id, Date fechaSolicitado, Date fechaDevolucion, boolean devuelto, Usuario usuario, Notificacion notificacion1, Notificacion notificacion2, Notificacion notificacion3) {
		this.id = id;
		this.fechaSolicitado = fechaSolicitado;
		this.fechaDevolucion = fechaDevolucion;
		this.devuelto = devuelto;
		this.usuario = usuario;
		this.notificaciones.add(notificacion1);
		this.notificaciones.add(notificacion2);
		this.notificaciones.add(notificacion3);
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
}