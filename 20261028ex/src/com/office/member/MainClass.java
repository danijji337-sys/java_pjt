package com.office.member;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean dev = true;
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		if(dev) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		final int SIGN_UP = 1;
		final int SIGN_IN = 2;
		final int MODIFY = 3;
		final int DELETE = 4;
		final int MEMBER_QUERY_SERVICE = 5;
		final int SYSTEM_OUT = 99;
		
		// 과제 1 더미데이터 초기화는 개발환경과 실환경으로 구분해야 한다
		
		while (memberService.systemFlag) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.MEMBER-LIST     99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case SIGN_UP:
				//memberSevice = new Memberservice();
				memberService.doSignUp(scanner);
				
				break;
				
			case SIGN_IN:
				//memberSevice = new Memberservice();
				memberService.doSignIn(scanner);
				System.out.println("현재 상태: " + memberService.systemFlag);
				break;
				
			case MODIFY:
				
				memberService.doModify(scanner);
				
				break;
				
			case DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case MEMBER_QUERY_SERVICE:
				
				memberService.printAllMembers();
				
				break;
				
			case SYSTEM_OUT:
				System.out.println("Say Good bye~");
				memberService.systemFlag = false;
				break;
				
			
			// 과제 2 case 에 사용되는 리터럴 상수 상수로 변경하기
			// 과제 3 메뉴 5번 전체 회원정보 출력 기능구현(AI 도움)
			}
					
					
		}	
		
		scanner.close();
	}
	

}
