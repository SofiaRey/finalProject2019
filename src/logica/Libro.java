package logica;

import java.util.ArrayList;
import java.util.Date;

public class Libro {

	private String aniCode;
	private String autor;
	private Date fechaPubl;
	private int nroEdicion;
	private String editorial;
	private String descripcion;
	private int cantEjemplares;
	private boolean hayEjemplarDisponible;
	private String codigoISBN;
	private String genero;
	private String imagUrl;
	private ArrayList<Prestamo> prestamos;
	 
	 //Constructor
	
	 public Libro(String aniCode, String autor, Date fechaPubl, int nroEdicion, String editorial, String descripcion, int cantEjemplares, boolean hayEjemplarDisponible, String codigoISBN, String genero, String imagUrl) {
		this.aniCode = aniCode;
		this.autor = autor;
		this.fechaPubl = fechaPubl;
		this.nroEdicion = nroEdicion;
		this.editorial = editorial;
		this.descripcion = descripcion;
		this.cantEjemplares = cantEjemplares;
		this.hayEjemplarDisponible = hayEjemplarDisponible;
		this.codigoISBN = codigoISBN;
		this.genero = genero;
		this.imagUrl = imagUrl;
	}

	//Getters and Setters 

	public String getAniCode() {
		return aniCode;
	}



	public void setAniCode(String aniCode) {
		this.aniCode = aniCode;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public Date getFechaPubl() {
		return fechaPubl;
	}



	public void setFechaPubl(Date fechaPubl) {
		this.fechaPubl = fechaPubl;
	}



	public int getNroEdicion() {
		return nroEdicion;
	}



	public void setNroEdicion(int nroEdicion) {
		this.nroEdicion = nroEdicion;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getCantEjemplares() {
		return cantEjemplares;
	}
	public void setCantEjemplares(int cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}
	
	public boolean isHayEjemplarDisponible() {
		return hayEjemplarDisponible;
	}
	public void setHayEjemplarDisponible(boolean hayEjemplarDisponible) {
		this.hayEjemplarDisponible = hayEjemplarDisponible;
	}
	
	public String getCodigoISBN() {
		return codigoISBN;
	}
	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getImagUrl() {
		return imagUrl;
	}
	public void setImagUrl(String imagUrl) {
		this.imagUrl = imagUrl;
	}
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
}
