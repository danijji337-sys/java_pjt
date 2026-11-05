package com.office.member;

public class MainClass {

	public static void main(String[] args) {
		
		
		
//		new MemberController().execute();
//		MemberContainer memberContainer = MemberContainer.getInstance()
//		memberContainer.getMemberContainer().

		MemberContainer.getInstance()
						.getMemberController()
						.execute();
		
	}
	
}
