package com.office.member;

public interface IMemberService {

	public void checkId(MemberDto memberDto);
	public void checkPw(String memPw);	
	public void signUp(MemberDto memberDto); 
	public void signIn(MemberDto memberDto);
	public void signOut(MemberDto memberDto);
	public void modipy(MemberDto memberDto);
	public void delete(MemberDto memberDto);

}
