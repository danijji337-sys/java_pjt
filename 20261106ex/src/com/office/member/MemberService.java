package com.office.member;

public class MemberService implements IMemberService {

	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public void checkId(MemberDto memberDto) {

		boolean isMemberId = memberDao.isMember(memberDto.getMemId());
		
		if (!isMemberId) {
			System.out.println("사용 가능한 ID 입니다");
			
		} else {
			System.out.println("이미 존재하는 ID입니다");
			
		}
		
	}

	@Override
	public void checkPw(String memPw) {
		
		if (memPw.length() >= 4) {
			System.out.println("사용 가능한 PW 입니다");
			
		} else {
			System.out.println("너무짧은 PW 입니다. 다시 입력해주세요");
			
		}	
		
	}

	@Override
	public void signUp(MemberDto memberDto) {
		
		int result = memberDao.insertNewMember(memberDto); 
		
		if (result == 0) {
			System.out.println("죄송합니다. 회원가입 실패입니다. 다시 시도해주세요");
			
		} else {
			System.out.println("회원가입 성공했어요");
			
			
		}		
	}

	@Override
	public void signIn(MemberDto memberDto) {
		
		System.out.println(memberDto.getMemId());
		System.out.println(memberDto.getMemPw());
		
		MemberDto searchedMemberDto =
				memberDao.searchMemberByMemIdMemPw(memberDto);

		
		if (searchedMemberDto == null) {
			System.out.println("로그인 실패");
			
		} else {
			System.out.println("로그인 성공");
			
		}
		
		
	}

	@Override
	public void signOut(MemberDto memberDto) {

		
		
	}
	
	@Override
	public void modipy(MemberDto memberDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
	
	
}
