package com.office.member;

import java.util.Scanner;
import java.util.Map;

public class MemberService {
	
	// 속성 
	MemberDB db;
	boolean systemFlag = true;
	int signInFail = 0;
	// 생
	
	public MemberService(MemberDB db) {
		this.db = db;
	}
	
	// 기능(메서드)
	
	// 회원 가입
	public void doSignUp(Scanner scanner) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		Member searchedMember = db.memberDB.get(memberId);
		if(searchedMember != null) {
			
			System.out.println("이미 가입된 회원입니다");
			
		} else {
			
			System.out.println("Input new member PW");
			String memberPw = scanner.next();
			
			
			if(memberPw.length() < 8 || memberPw.length() >= 12) {
				
				System.out.println("적합하지 않은 비밀번호 입니다");
				
			} else {
		
				System.out.println("Input new member MAIL");
				String memberMail = scanner.next();
		
				System.out.println("Input new member PHONE");
				String memberPhone = scanner.next();
		
				Member member  = new Member(memberId, memberPw, memberMail, memberPhone);
				//MemberDB db = new MemberDB();
		
				db.memberDB.put(memberId, member);
		
				db.memberDB.get(memberId).printInfo();
			}
			
		}
		// 4 id 중복체크 기능 추가, 5 비밀번호 8~12자리 문자로 표현
	}
	// 로그인
	public void doSignIn(Scanner scanner) {
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		//MemberDB db = new MemberDB();
		Member searchedMember =  db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {		
				
				System.out.println("SIGN IN SUCCASS!!");
				signInFail = 0;
				
		} else {
				signInFail++;
				System.out.println("로그인 실패 횟수: " + signInFail);
				System.out.println("남은 기회: " + (4 - signInFail) + "번");
				System.out.println("SIGN IN FAIL!!");
				
				if (signInFail > 3) {
					System.out.println("로그인 실패 횟수가 많아 시스템을 종료합니다.");
					this.systemFlag = false;
							
				}
			}
			
	
		
		// 과제 6 로그인 실패가 3회 초과면 시스템 종료 (4번틀리면 시스템종료 메인클래스 palse로 바꾸기)
		
	}
	// 회원 정보 수정
	public void doModify(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember =  db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			System.out.println("Input NEW member PW");
			memberPw = scanner.next();
			
			System.out.println("Input NEW member MAIL");
			String memberMail = scanner.next();
			
			System.out.println("Input NEW member PHONE");
			String memberPhone = scanner.next();
			
			searchedMember =  db.memberDB.get(memberId);
			searchedMember.memberPw = memberPw;
			searchedMember.memberMail = memberMail;
			searchedMember.memberPhone = memberPhone;
			
			searchedMember = db.memberDB.get(memberId);
			searchedMember.printInfo();
			
			
	} else { 
		
		System.out.println("회원 정보가 일치하지 않습니다");
		
		}		
		// 7 과제 id pw 인증 -> 정보수정
	}
	// 회원 정보 조회


    public void printAllMembers() {
    	
        System.out.println("회원 수: " + db.memberDB.size());
        
        for (Map.Entry<String, Member> entry : db.memberDB.entrySet()) {
            Member member = entry.getValue();

            System.out.println("회원 ID: " + member.memberId);
            System.out.println("비밀번호: " + member.memberPw);
            System.out.println("이메일: " + member.memberMail);
            System.out.println("전화번호: " + member.memberPhone);
            System.out.println("--------------------");
        }
    

    	
    }
	
	// 회원 탈퇴
	public void doDelete(Scanner scanner) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
		
		Member searchedMember =  db.memberDB.get(memberId);
		
		if(searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
	}
}
