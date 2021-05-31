package com.java.practicastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
	
	private static void contarStream(List<Videojuego> videojuegos) {
		
		Stream<Videojuego> videojuegoStream = videojuegos.stream();
		long videojuegosContador = videojuegoStream.count();
		System.out.println("Hay " + videojuegosContador + " videojuegos");
	}
	
	private static void filterForEach(List<Videojuego> videojuegos) {
		
		Stream<Videojuego> videojuegoStream = videojuegos.stream();
		videojuegoStream.filter(videojuego -> videojuego.getNota() > 8)
			.forEach(videojuego -> System.out.println(videojuego));
	}

	public static void main(String[] args) {
		
		Videojuego v1 = new Videojuego("Mass Effect", "Bioware", 60, 9, true);
		Videojuego v2 = new Videojuego("Cyberpunk 2077", "CD Project Red", 60, 6, false);
		Videojuego v3 = new Videojuego("Divinity Original Sin", "Larian Studios", 40, 9, true);
		Videojuego v4 = new Videojuego("Alien Colonial Marines", "Gearbox", 30, 3, false);
		Videojuego v5 = new Videojuego("Fallout New Vegas", "Bethesda", 25, 10, true);
		Videojuego v6 = new Videojuego("Hollow Knight", "Team Cherry", 15, 9, true);
		
		List<Videojuego> videojuegos = new ArrayList<Videojuego>();
		
		videojuegos.add(v1);
		videojuegos.add(v2);
		videojuegos.add(v3);
		videojuegos.add(v4);
		videojuegos.add(v5);
		videojuegos.add(v6);
		
		App.contarStream(videojuegos);
		App.filterForEach(videojuegos);

	}

}
