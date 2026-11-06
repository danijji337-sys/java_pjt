package com.office.member;

import java.util.Scanner;

public class MemberController implements iMemberConfig{

	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	public void execute() {
		boolean systemflag = true;
		Scanner scanner = new Scanner(System.in);
		MemberDto memberDto = new MemberDto();
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		while(systemflag) {
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.SIGN-OUT   4.MODIFY   5.DELETE   6.WRITE   7.READ   99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch(selectedMenuNum) {
			
			case SING_UP:
				
				
				System.out.println("Input new member ID");
				memId = scanner.next();
								
				memberDto.getMemId();				
				memberService.checkId(memberDto);
				
				System.out.println("Input new member PW");
				
				memPw = scanner.next();
				
				memberService.checkPw(memPw);
				
				System.out.println("Input new member MAIL");
				memMail = scanner.next();
				
				System.out.println("Input new member PHONE");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				break;
				
			case SING_IN:
				
				System.out.println("Input new member ID");
				memId = scanner.next();
				System.out.println("Input new member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.getMemId();
				memberDto.getMemPw();
				
				memberService.signIn(memberDto);
				break;
				
			case SING_OUT:
				
				System.out.println("Input new member ID");
				memId = scanner.next();
				System.out.println("Input new member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.getMemId();
				memberDto.getMemPw();
				
				memberService.signOut(memberDto);
				break;
				
			case MODIFY:
				
				break;
				
			case DELETE:
				
				break;
				
			case WRITE:
				
				break;
				
			case READ:
				
				break;
				
			case SYSTEM_OUT:
				System.out.println("See you next time ~");
				systemflag = false;
				break;
			
			
			}
			
		}
		
		scanner.close();
	}
	
	
}
