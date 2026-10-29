package com.office.stdentSocre;

public class Student {
	
	//속성(맴버필드)
	String schoolName = "DW고등학교";
	String studentID;
	String studentPW;
	int korean1Score;
	int korean2Score;
	int english1Score;
	int english2Score;
	
	public Student(
			String studentID, 
			String studentPW) {

		this.studentID = studentID;
		this.studentPW = studentPW;
	}
	
	
	
}
