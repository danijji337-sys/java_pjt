package com.office.methodex01;

public class MainClass {

	public static void main(String[] args) {
		
		//메서드 오버로딩: 메서드가 여러개 선언된 것을 말한다
		//Greet greet = new Greet();

		//greet.printGreetWord();
		//greet.printGreetWord("홍길동");
		
		//요구사항 : 고객이름 + 안녕하세요. ex) 홍길동님 + 안녕하세요
		//요구사항 : 모르는사람 + 안녕하세요. ex) 홍길동님 + 안녕하세요
		/*
		AddOperetor addOperetor = 
				new AddOperetor();
		
		addOperetor.add(10, 20);
		addOperetor.add(1.5f, 2.5f);
		addOperetor.add(3.14, 9.8);
		addOperetor.add("Hello", "World");
		*/
		
		Score score = new Score();
		score.printStudentScore(90, 80, 70); // 3명 학생의 총점 평점 
		score.printStudentScore(100, 90, 80, 90, 70);
		score.printStudentScore(90, 100, 80, 70);
	}
	
}
