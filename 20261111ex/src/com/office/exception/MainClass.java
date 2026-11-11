package com.office.exception;

public class MainClass {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 10
		
		/*
		 *  예외 처리 : try ~ catch문(방어 코드)
		 */
		
		try {
			System.out.println("num1 / num2 = " + (num1 / num2)); // exception			
			System.out.println("++++++++++++++++++++");
			
		} catch (NullPointerException e) {
			//System.out.println(e.getMessage()); 
			e.printStackTrace(); 
			
		} catch (ArithmeticException e) {
			e.printStackTrace(); 
			
		} catch (Exception e) {
			e.printStackTrace(); 
			
		}finally {
			System.out.println("finally");
			
		}
		
		System.out.println("num1 - num2 = " + (num1 - num2)); // 10		
		System.out.println("num1 * num2 = " + (num1 * num2)); // 0
		
	}
	
}
