package com.java.practicaoptional;

import java.util.Optional;

public class App {
	
	private static BuscadorVideojuegos buscadorVideojuegos;
	
	
	//Buscar pel�cula con optional y consumidor lambda
		public static void buscarVideojuegoLambda() {
			
			Optional<Videojuego> optionalVideojuego = buscadorVideojuegos.buscarOptional(3);
			
			optionalVideojuego.ifPresent(titulo -> System.out.println("T�tulo del videojuego: " + titulo.getNombre()));
		}

	public static void main(String[] args) {
		
		App.buscarVideojuegoLambda();
	}
}
