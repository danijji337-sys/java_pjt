package com.office.stdentSocre;

import java.util.Scanner;

public class MainCalss {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {

			System.out.println("1.SIGN-UP    2.SIGN-IN    3.CHECK-SCORE    4.MODIFY   5.DELETE    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			switch(selectedMenu) {
			case 1://회원가입
				
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
				
				break;
			
			}
		
		
		}
		
	
		scanner.close();
		
	}
	
}
