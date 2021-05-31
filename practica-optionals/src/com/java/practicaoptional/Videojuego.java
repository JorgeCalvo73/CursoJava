package com.java.practicaoptional;

import java.util.Optional;

public class Videojuego {

	private String nombre;
	private Optional<Estudio> estudio;
	private Integer precio;
	private Integer nota;
	private Boolean recomendable;
	
	
	
	public Videojuego() {
		estudio = Optional.empty();
	}

	public Videojuego(String nombre, Integer precio, Integer nota, Boolean recomendable) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.nota = nota;
		this.recomendable = recomendable;
		
		Estudio e = new Estudio("Bioware");
		this.estudio = Optional.of(e);
	}
	
	public Optional<Estudio> getEstudio(){
		return estudio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
