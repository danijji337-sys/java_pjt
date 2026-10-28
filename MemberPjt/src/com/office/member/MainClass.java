package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		boolean systemFlag = true;
		String[] memberInfos;
		
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int MENU_END = 99;
		//      gildong, ["1234", "gildong@gmail.com", "010-1234-5678"]
		//      chanho, ["0000", "chanho@naver.com", "010-2222-3333"]
		HashMap<String, String[]> members = new HashMap<String, String[]>();
		
		// DUMY DATA STRAT
		members.put("gildong", new String[]{"gildong", "1234", "gildong@gmail.com", "010-1234-5678"});
		
		memberInfos = members.get("gildong");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		
		members.put("chanho", new String[]{"chanho", "0000", "chanho@naver.com", "010-2222-3333"});
		
		memberInfos = members.get("chanho");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
					
		// DUMY DATA END
		
		String memberID;
		String memberPW;
		String memberMail;
		String memberPhone;
		
		while (systemFlag) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.END");
			
			int selecedMenuNumber = scanner.nextInt();
						
			switch(selecedMenuNumber){
			case MENU_SIGN_UP:    //SIGN-UP 회원가입
				
				System.out.println("Input new member ID !!");
				memberID = scanner.next();
				memberInfos = members.get(memberID);
				
				if (memberInfos != null) {
					System.out.println("이미 가입된 사용자 입니다");
				} else {
					
					System.out.println("Input new member PW!!");
					memberPW = scanner.next();
					
					memberInfos = members.get(memberID);
					int memberPwLength = memberPW.length();
					
					if (memberPwLength <= 8 || 20 <= memberPwLength) {
						System.out.println("적합하지 않은 비밀번호 입니다");
					} else {
						System.out.println("Input new member MAIL!!");
						memberMail = scanner.next();
				
						System.out.println("Input new member PHONE");
						memberPhone = scanner.next();
				
						members.put(memberID, new String[]{memberID, memberPW, memberMail, memberPhone});
				
						memberInfos = members.get(memberID);
						for (int i = 0; i < memberInfos.length; i++) {
							System.out.println(memberInfos[i]);
						}
					
					}

				}
				break;
				
			case MENU_SIGN_IN:    //SIGN-IN 로그인
				
				System.out.println("Input new member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input new member PW!!");
				memberPW = scanner.next();
				
				memberInfos =  members.get(memberID);
				System.out.println("memberInfos: " + memberInfos);
				
				if (memberInfos != null && memberInfos[1].equals(memberPW)) {
					
						System.out.println("SIGN_IN SUCCESS!!");
						
				} else {
					
					// ID 불일치 == 로그인 실패
					System.out.println("SIGN_IN FAIL!!");
					
				}
				
				break;
				
			case MENU_MODIFY:    //MODIFY 정보수정
				
				members.forEach((key, value) -> {
				    System.out.println(key + " = " + value);
				});
				
				System.out.println("Input member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input member PW!!");
				memberPW = scanner.next();
				
				System.out.println("Input member MAIL!!");
				memberMail = scanner.next();
				
				System.out.println("Input member PHONE");
				memberPhone = scanner.next();
				
				memberInfos = members.get(memberID);
				if (memberInfos != null) {
					memberInfos[1] = memberPW;
					memberInfos[2] = memberMail;
					memberInfos[3] = memberPhone;
					
					String[] tempInfos = members.get(memberID);
					for (String tempInfo : tempInfos) {
						System.out.println(tempInfo);
					}
					
				} else {
					System.out.println("존재하지 않는 ID 입니다. 다시 확인 하세요.");
				}
				
				break;
				
			case MENU_DELETE:    //DELETE 회원탈퇴
				
				System.out.println("Input new member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input new member PW!!");
				memberPW = scanner.next();
				
				memberInfos =  members.get(memberID);
				if(memberInfos != null && memberInfos[1].equals(memberPW)) {

						System.out.println("삭제 처리 이후: " + members.get(memberID));
						
					
				} else {
					
					System.out.println("존재하지 않습니다. 다시 확인 하세요.");
				}
				
				break;
				
			case MENU_END:    //DELETE 회원탈퇴
				System.out.println("Goooooooooood bye!!");
				systemFlag = false;
				break;
			
			}
	 		
			
		}
		
		scanner.close();
		
	}
	
}
