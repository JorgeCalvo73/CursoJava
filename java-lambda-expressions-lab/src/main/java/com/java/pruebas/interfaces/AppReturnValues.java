package com.java.pruebas.interfaces;

public class AppReturnValues {

	public static void usingInterfaceLambdaReturnValues() {

		String username = "Daniela";

		//Aquí sobreescribimos el método de la interfaz y la usamos directamente
		InterfaceReturnMethod interfaceReturnValue = new InterfaceReturnMethod() {

			@Override
			public String sayHello(String name) {

				return "Username To Uppercase: " + name.toUpperCase();
			}
		};
		System.out.println(interfaceReturnValue.sayHello(username));

		// Usando expresión lambda
		InterfaceReturnMethod callLambdaExp = incomingToLowerName -> {
			System.out.println("Username to lowercase: " + incomingToLowerName.toLowerCase());
			return "Returned Username to lowercase: " + incomingToLowerName.toLowerCase();
		};
		System.out.println(callLambdaExp.sayHello(username));

		
	}

	public static void main(String[] args) {

		AppReturnValues.usingInterfaceLambdaReturnValues();
	}

}
