package com.java.pruebas.interfaces;

public class AppWithoutParameters {
	
	public static void usingInterfaceLambdaWithoutParameters() {
		InterfaceWithoutParameters sayHelloByName = () -> System.out.println("Hello dude");
		
		sayHelloByName.sayHello();
		
	}

}
