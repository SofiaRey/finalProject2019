package logica;

import java.util.Date;

public class Notificacion {

	private int ciUsuario;
	private String mail;
	private Date fechaSolicitado;
	private Date fechaDevolucion;
	
	//Constructor
	
	public Notificacion(int ciUsuario, String mail, Date fechaSolicitado, Date fechaDevolucion) {
		this.ciUsuario = ciUsuario;
		this.mail = mail;
		this.fechaSolicitado = fechaSolicitado;
		this.fechaDevolucion = fechaDevolucion;
	}
	//Getters and Setters
	public int getCiUsuario() {
		return ciUsuario;
	}
	public void setCiUsuario(int ciUsuario) {
		this.ciUsuario = ciUsuario;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
}
