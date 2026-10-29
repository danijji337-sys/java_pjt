package com.office.stdentSocre;

import java.util.Scanner;

public class Service {
	
	StudentDB db;
	Student student;
	int num = 0;
	
	public Service(StudentDB sdb) {
		
		this.db = db;
	}
	
	private void doSignUP(Scanner scanner) {
		
		while (true) {
			System.out.println("학교이름을 입력하시오");
			String inputSchoolName = scanner.next();
		
			if (inputSchoolName != student.schoolName) {
				System.out.println("올바르지 않은 학교 이름입니다");
				num++;
				if(num > 4) {
					System.out.println("올바르지 않은 학교 이름 3회이상이라 프로그램 종료합니다");
					break;
				}
			} else {
				num = 0;
				System.out.println("학교이름을 입력하시오");
				String inputSudentID = scanner.next();
		
				System.out.println("학교이름을 입력하시오");
				String inputSudentPW = scanner.next();
		
		
				student = new Student(inputSudentID, inputSudentPW);
				db.studentDB.put(inputSudentID, student);
				break;
			}
		
		}
		
		
		
	}

}
