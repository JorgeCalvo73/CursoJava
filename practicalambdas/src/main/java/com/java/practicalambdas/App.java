package com.java.practicalambdas;

public class App {
	
	public static void decirVerdades() {
		
		String verdad = "El Se�or de los Anillos es la mejor trilog�a de la historia";
		InterfacePractica verdades = (verdadDicha) -> System.out.println(verdadDicha);
		
		verdades.verdadesComoPu�os(verdad);
	}

	public static void main(String[] args) {
		
		App.decirVerdades();
	}
}
