package com.java.pruebas.interfaces;

public class AppWithOneParameter {
	
	public static void usingInterfaceLambdaWithOneParameter() {
		
		String userName = "Nadia";
		InterfaceWithOneParameter sayHelloByName = (userNameToShow) -> System.out.println("Hello " + userNameToShow);
		
		sayHelloByName.sayHello(userName);
	}

	public static void main(String[] args) {
		
		AppWithOneParameter.usingInterfaceLambdaWithOneParameter();

	}

}
