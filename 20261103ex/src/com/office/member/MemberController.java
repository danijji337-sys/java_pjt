package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig{
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemflag = true;
		
		while (systemflag) {
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.MODIPY   4.DELTE   99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			MemberService memberService = new MemberService();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				memberService.signIn(scanner);
				break;
				
			case SIGN_IN:
				memberService.signIn(scanner);
				break;
				
			case MODIPY:
				memberService.modipy(scanner);
				break;
				
			case DELTE:
				memberService.delet(scanner);
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
