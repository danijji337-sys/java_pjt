package com.office.member;

public class MemberContainer {

	private static MemberContainer memberContainer;
	
	final private MemberDao MEMBER_DAO = new MemberDao();
	final private MemberService MEMBER_SERVICE = new MemberService(MEMBER_DAO);
	final private MemberController MEMBER_CONTROLLER = new MemberController(MEMBER_SERVICE);
	
	private MemberContainer() {}
		
	public static MemberContainer getinstance() {
		if(memberContainer == null) {
			memberContainer = new MemberContainer();
			
		}	
		return memberContainer;		
	}

	public MemberController getMEMBER_CONTROLLER() {
		return MEMBER_CONTROLLER;
	}

	public MemberService getMEMBER_SERVICE() {
		return MEMBER_SERVICE;
	}

	public MemberDao getMEMBER_DAO() {
		return MEMBER_DAO;
	}
	
}
