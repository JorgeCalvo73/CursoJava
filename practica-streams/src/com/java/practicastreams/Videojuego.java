package com.java.practicastreams;

public class Videojuego {

	private String nombre;
	private String estudio;
	private Integer precio;
	private Integer nota;
	private Boolean recomendable;
	
	public Videojuego(String nombre, String estudio, Integer precio, Integer nota, Boolean recomendable) {
		super();
		this.nombre = nombre;
		this.estudio = estudio;
		this.precio = precio;
		this.nota = nota;
		this.recomendable = recomendable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Boolean getRecomendable() {
		return recomendable;
	}

	public void setRecomendable(Boolean recomendable) {
		this.recomendable = recomendable;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", estudio=" + estudio + ", precio=" + precio + ", nota=" + nota
				+ ", recomendable=" + recomendable + "]";
	}
}
