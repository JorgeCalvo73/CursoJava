package com.java.practicaoptional;

public class Estudio {

	private String nombre;

	public Estudio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Estudio [nombre=" + nombre + "]";
	}
	
	
}
