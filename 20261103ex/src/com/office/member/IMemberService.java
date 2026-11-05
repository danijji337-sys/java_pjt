package com.office.member;

public interface IMemberService {

	public void signUp(MemberDto memberDto); 
	public void signIn(MemberDto memberDto);
	public void modipy(MemberDto memberDto);
	public void delete(MemberDto memberDto);
	
	
}
