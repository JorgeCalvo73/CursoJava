package com.java.pruebas.businessLogic;

import java.util.Optional;

import com.java.pruebas.domain.Movie;

public class MovieSearchBusiness {
	
	public Movie search(Integer id) {

		switch (id) {
		case 1:
			return new Movie(1, "Alien: El octavo pasajero");
		case 2:
			return new Movie(2, "El señor de los anillos: Las dos torres");
		case 3:
			return new Movie(3, "Endgame");
		default:
			return null;
		}

	}

	public static Optional<Movie> searchOptional(Integer id) {

		switch (id) {
		case 1:
			return Optional.of(new Movie(1, "Alien: El octavo pasajero"));
		case 2:
			return Optional.of(new Movie(2, "El señor de los anillos: Las dos torres"));
		case 3:
			return Optional.of(new Movie(3, "Endgame"));
		default:
			return Optional.empty();

		}
	}

}
