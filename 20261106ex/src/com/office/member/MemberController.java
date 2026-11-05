package com.office.member;

import java.util.Scanner;

public class MemberController {

	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	public void execute() {
		boolean systemflag = true;
		Scanner scanner = new Scanner(System.in);
		
		while(systemflag) {
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.SIGN-OUT   4.MODIFY   5.DELETE   6.WRITE   7.READ   99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch(selectedMenuNum) {
			
			// 인터페이스 상수 
			
			}
			
		}
		
		scanner.close();
	}
	
	
}
