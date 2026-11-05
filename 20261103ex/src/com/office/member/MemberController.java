package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig{
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
		
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemflag = true;
//		MemberService memberService = new MemberService();
		
		if (IS_DEV) {
			new MemberDumy().signUpForDumy(memberService);
		}
		
		String memId; 
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		while (systemflag) {
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.MODIPY   4.DELETE   99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				
				System.out.println("Input new member ID");
				memId = scanner.next();
				
				System.out.println("Input new member PW");
				memPw = scanner.next();
				
				System.out.println("Input new member MAIL");
				memMail = scanner.next();
				
				System.out.println("Input new member PHONE");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				break;
				
			case SIGN_IN:
				
				System.out.println("Input member ID");
				memId = scanner.next();
				
				System.out.println("Input member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				memberService.signIn(memberDto);
				break;
				
			case MODIPY:
				/*
				 * ID & PW 인증 후 PW, MAIL, PHONE 수정한다
				 */
				System.out.println("Input member ID");
				memId = scanner.next();
				
				System.out.println("Input member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				boolean isAuthentication =
						memberService.doAuthenticationByMemIdMemPw(memberDto);
				
				if(isAuthentication) {
					
					System.out.println("Input member PW");
					memPw = scanner.next();
					
					System.out.println("Input member MAIL");
					memMail = scanner.next();
					
					System.out.println("Input member PHONE");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modipy(memberDto);
				}
				
				
				break;
				
			case DELETE:
				/*
				 * ID & PW 인증 후 삭제
				 */
				
				System.out.println("Input member ID");
				memId = scanner.next();
				
				System.out.println("Input member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto();
				memberDto.setMemId(memId);
				memberDto.setMemPw(memPw);
				
				memberService.delete(memberDto);
				break;
				
			case SYSTEM_OUT:				
				systemflag = false;
				System.out.println("good bye~");
				
				break;
			
			
			}
			
			
		}
		scanner.close();
	}
	
}
