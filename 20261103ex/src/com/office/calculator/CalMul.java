package com.office.calculator;

public class CalMul implements ICalculator{

	// 곱셈 연산
	/*
	private int calMul(int n1, int n2) {
			int result = n1 * n2;
			System.out.println("result: " + result);
			return result;
		}
	*/
		@Override
		public int doOperator(int n1, int n2) {
			int result = n1 * n2;
			return result;
		}
	
}
