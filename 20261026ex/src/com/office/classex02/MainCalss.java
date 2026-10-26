package com.office.classex02;

public class MainCalss {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("홀길동", 1, 20, "computer");
		Student student2 = new Student("박찬호", 1, 21, "Sports");
		
		/*
		System.out.println("Name: " + student1.name);
		System.out.println("Grade: " + student1.grade);
		System.out.println("Age: " + student1.age);
		System.out.println("Major: " + student1.major);
		*/
		
		student1.printInpo();
		student2.printInpo();
		
		Student student3 = new Student("김경문", 2, 22, "Baseball");
		student3.printInpo();
	}
	
}
