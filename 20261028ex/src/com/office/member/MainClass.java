package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Config config = new Config();
		Flag flag = new Flag();
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		if(config.IS_DEV) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		
		
		// 과제 1 더미데이터 초기화는 개발환경과 실환경으로 구분해야 한다
		
		while (flag.systemFlag) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.MEMBER-LIST     99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case Menu.MENU_SIGN_UP:
				//memberSevice = new Memberservice();
				memberService.doSignUp(scanner);
				
				break;
				
			case Menu.MENU_SIGN_IN :
				//memberSevice = new Memberservice();
				memberService.doSignIn(scanner, flag);
				break;
				
			case Menu.MENU_MODIFY:
				
				memberService.doModify(scanner);
				
				break;
				
			case Menu.MENU_DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case Menu.MENU_PRINT_ALL_MEMBER:
				
				//memberService.printAllMembers();
				HashMap<String, Member> db = memberDB.memberDB;
				
				for(String key :db.keySet()) {
					Member member = db.get(key);

		            System.out.println("회원 ID: " + member.memberId);
		            System.out.println("비밀번호: " + member.memberPw);
		            System.out.println("이메일: " + member.memberMail);
		            System.out.println("전화번호: " + member.memberPhone);
				}
				
				for(Member member :db.values()) {

		            System.out.println("회원 ID: " + member.memberId);
		            System.out.println("비밀번호: " + member.memberPw);
		            System.out.println("이메일: " + member.memberMail);
		            System.out.println("전화번호: " + member.memberPhone);
				}
				
				
				break;
				
			case Menu.MENU_SYSTEM_OUT:
				System.out.println("Say Good bye~");
				flag.systemFlag = false;
				break;
				
			
			// 과제 2 case 에 사용되는 리터럴 상수 상수로 변경하기
			// 과제 3 메뉴 5번 전체 회원정보 출력 기능구현(AI 도움)
			}
					
					
		}	
		
		scanner.close();
	}
	

}
