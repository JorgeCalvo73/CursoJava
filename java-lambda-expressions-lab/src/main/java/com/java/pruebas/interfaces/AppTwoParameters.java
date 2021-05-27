package com.java.pruebas.interfaces;

public class AppTwoParameters {
	
	public static void usingInterfaceLambdaWithTwoParametersAndReturn() {
		Integer number1 = 5;
		Integer number2 = 4;
		
		InterfaceWithTwoParameters interfaceSum = (incomingNumber1, incomingNumber2) -> {
			System.out.println("Value is: " + (incomingNumber1 + incomingNumber2));
			return incomingNumber1 + incomingNumber2;
		};
		
		interfaceSum.sum(number1, number2);
	}

	public static void main(String[] args) {
		
		AppTwoParameters.usingInterfaceLambdaWithTwoParametersAndReturn();
	}

}
