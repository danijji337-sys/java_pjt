package com.office.methodex;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator = 
				new Calculator();
		
		float rst = calculator.addOperator(10, 20);
		System.out.println("rst: " + rst);
		
		Object myCar = calculator.productCar();
		System.out.println("myCar: " + myCar);
	}
	
}
