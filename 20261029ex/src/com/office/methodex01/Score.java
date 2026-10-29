package com.office.methodex01;

public class Score {

	// 메서드 요구사항
	// 학급 합생 3명의 총점과 평균을 출력하는 메소드만들자
	/*
	public void printStudentScore(int s1 , int s2, int s3) {
		int totalScore = s1 + s2 + s3;
		double everageScore = totalScore / 3;
		
		System.out.println("total: " + totalScore);
		System.out.println("everage: " + everageScore);
	}
	
	// 요구사항 2명의 학생이 전학왔다
	
	public void printStudentScore(int s1 , int s2, int s3, int s4, int s5) {
		int totalScore = s1 + s2 + s3 + s4 + s5;
		double everageScore = totalScore / 5;
		
		System.out.println("total: " + totalScore);
		System.out.println("everage: " + everageScore);
	}
	
	// 한명 학생이 전학 갔다
	
	public void printStudentScore(int s1 , int s2, int s3, int s4) {
		int totalScore = s1 + s2 + s3 + s4;
		double everageScore = totalScore / 4;
		
		System.out.println("total: " + totalScore);
		System.out.println("everage: " + everageScore);
	}
	*/
	public void printStudentScore(int...scores) { // 배열
		
		int totalScore = 0;
		for(int score : scores) {
			totalScore += score;
		}
		
		double averageScore = totalScore / scores.length;
		
		System.out.println("total: " + totalScore);
		System.out.println("average: " + averageScore);
		
	}
	
	// 가변인자는 무조건 파라미터 마지막에 와야한다
	// 가변인자는 배열이다
	// 오버로딩과 가변인자는 같이 사용 가능하다
	
	private void printTotalScore(int...scores) {
		
	}
	
	private void printTotalScore(String className, int...scores) {
		
	}
	
}
