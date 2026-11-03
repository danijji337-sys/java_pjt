package com.office.calculator;

public class MainClass {

	
	public static void main(String[] args) {
		
		OurCalculator ourCalculator = 
				new OurCalculator();
		
		// 10 20 
		/*
		ourCalculator.calAdd(10, 20);
		ourCalculator.calSub(10, 20);
		ourCalculator.calMul(10, 20);
		ourCalculator.calDiv(10, 20);
		*/

		ourCalculator.calculate(20, 10, new CalAdd());
		ourCalculator.calculate(20, 10, new CalSub());
		ourCalculator.calculate(20, 10, new CalMul());
		ourCalculator.calculate(20, 10, new CalDiv());
	}
	
}
