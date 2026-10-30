package com.office.stdentSocre;

import java.util.Scanner;

public class Service {
	
	StudentDB db;
	Student student = new Student();
	int num = 0;


	public Service(StudentDB db, Flag flag) {
		
		this.db = db;
	}
	
	public void doSignUP(Scanner scanner, Flag flag) {
		
		while (true) {
			System.out.println("학교이름을 입력하시오");
			String inputSchoolName = scanner.next();
		
			if (!student.schoolName.equals(inputSchoolName)) {
				System.out.println("올바르지 않은 학교 이름입니다");
				num++;
				if(num > 3) {
					System.out.println("올바르지 않은 학교 이름 3회이상이라 프로그램 종료합니다");
					flag.systemFlag = false;
					break;
				}
			} else {
				num = 0;
				System.out.println("아이디를 입력하시오");
				String inputSudentID = scanner.next();
		
				System.out.println("비밀번호를 입력하시오");
				String inputSudentPW = scanner.next();
		
		
				student = new Student(inputSudentID, inputSudentPW);
				db.studentDB.put(inputSudentID, student);
				break;
			}
		
		}	
		
	}
	
	private void doSignIn(Scanner scanner) {
		
		System.out.println("아이디를 입력하시오");
		String inputSudentID = scanner.next();

		System.out.println("비밀번호를 입력하시오");
		String inputSudentPW = scanner.next();
		if (student.studentID.equals(inputSudentID) || student.studentPW.equals(inputSudentPW)) {
			System.out.println("로그인 실패");
		}
	}

}
