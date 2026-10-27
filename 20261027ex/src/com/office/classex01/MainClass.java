package com.office.classex01;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student studrnt1 = new Student(
				"홀길동",
				1,
				20,
				"Computer"
				);		
		Student studrnt2 = new Student(
				"박찬호",
				2,
				21,
				"Baseball"
				);
		Student studrnt3 = new Student(
				"박세리",
				3,
				22,
				"Golf"
				);	
		studrnt1.printInfo();
		studrnt2.printInfo();
		studrnt3.printInfo();
		// 배열
		/*
		 * 데이터 타입[] 레퍼런스 변수 = {아이템, 아이템, 아이템};
		 */
		Student[] students = {studrnt1, studrnt2, studrnt3};
		for (int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
		
		// 전공이 Baseball인 학생의 이름과 나이를 출력하자!
		// 1. 전공이 Baseball인 학생 조회
		// 2. 이름과 나이를 출력
		System.out.println("----------------------");
		for (int i = 0; i < students.length; i++) {
			if (students[i].major.equals("Baseball")) {
				System.out.println("Name: " + students[i].name + ", Age: " + students[i].age);
				break;
			}
		}
		
	}
	
}
