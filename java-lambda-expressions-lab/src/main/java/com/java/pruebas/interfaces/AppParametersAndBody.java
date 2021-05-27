package com.java.pruebas.interfaces;

public class AppParametersAndBody {
	
	public static void usingInterfaceLambdaWithParametersAndBody() {
		
		String username = "Daniela";
		
		//Sobreescribimos el método de la interfaz
		InterfaceWithParameterAndBody sayHelloByName = new InterfaceWithParameterAndBody() {
			
			@Override
			public void sayHello(String name) {
				
				System.out.println("Hello from lambda!: " + name);
			}
		};
		sayHelloByName.sayHello(username);
		
		//Usamos la expresión lambda
		InterfaceWithParameterAndBody callLamdaExp = incomingName -> System.out.println("Override sayHello Method! " + incomingName);
		callLamdaExp.sayHello(username);
	}

	public static void main(String[] args) {
		
		AppParametersAndBody.usingInterfaceLambdaWithParametersAndBody();
	}

}
