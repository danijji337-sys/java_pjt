package com.office.stdentSocre;

import java.util.Scanner;

public class MainCalss {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Flag flag = new Flag();
		StudentDB db = new StudentDB();
		Service service = new Service(db, flag);
		
		while (flag.systemFlag) {

			System.out.println("1.SIGN-UP    2.SIGN-IN    3.CHECK-SCORE    4.MODIFY   5.DELETE    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch(selectedMenu) {
			case 1://회원가입
				
				service.doSignUP(scanner, flag);
				
				break;
				
			case 2://로그인
				
				break;
				
			case 3://성적확인
		
				break;
				
			case 4://정보수정
				
				break;
				
			case 5://회원탈퇴
				
				break;
				
			case 99://시스템 종료
				System.out.println("시스템 종료하시겠습니까?");
				flag.systemFlag = false;
				break;
			
			}
		
		
		}
		
	
		scanner.close();
		
	}
	
}
