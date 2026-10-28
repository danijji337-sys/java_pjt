package com.office.member;

public class Member {
	
	// 속성(맴버필드)
	
	String memberId;
	String memberPw;
	String memberMail;
	String memberPhone;
	/*
	 * (정책적인것)
	 * 아이디,비밀번호,메일주소,연락처
	 */

	
	// 생성자
	public Member() {
		
	}
	
	
	
	public Member(String memberId, String memberPw, String memberMail, String memberPhone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberMail = memberMail;
		this.memberPhone = memberPhone;
	}

	




	// 기능(메서드)
	/*
	 * 회원 정보 출력 기능
	 */
	public void printInfo() {
		System.out.println("MEMBER ID: " + memberId);
		System.out.println("MEMBER PW: " + memberPw);
		System.out.println("MEMBER MAIL: " + memberMail);
		System.out.println("MEMBER PHONE: " + memberPhone);
	}
	
	
	

}
