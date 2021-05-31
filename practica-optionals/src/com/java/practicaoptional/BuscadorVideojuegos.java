package com.java.practicaoptional;

import java.util.Optional;

public class BuscadorVideojuegos {

	public Videojuego buscar(Integer id) {
		
		switch (id) {
		case 1:
			return new Videojuego("Mass Effect", 60, 9, true);
		case 2:
			return new Videojuego("Divinity Original Sin", 40, 9, true);
		case 3:
			return new Videojuego("Fallout New Vegas", 25, 10, true);
		default:
			return null;
		}
	}
	
	public static Optional<Videojuego> buscarOptional(Integer id) {

		switch (id) {
		case 1:
			return Optional.of(new Videojuego("Mass Effect", 60, 9, true));
		case 2:
			return Optional.of(new Videojuego("Divinity Original Sin", 40, 9, true));
		case 3:
			return Optional.of(new Videojuego("Fallout New Vegas", 25, 10, true));
		default:
			return Optional.empty();

		}
	}
}
