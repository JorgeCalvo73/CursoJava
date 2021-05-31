package com.java.practicalambdas;

public class App {
	
	public static void decirVerdades() {
		
		String verdad = "El Señor de los Anillos es la mejor trilogía de la historia";
		InterfacePractica verdades = (verdadDicha) -> System.out.println(verdadDicha);
		
		verdades.verdadesComoPuños(verdad);
	}

	public static void main(String[] args) {
		
		App.decirVerdades();
	}
}
