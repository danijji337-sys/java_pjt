package com.office.member;

public class MemberService implements IMemberService{

	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		
		this.memberDao = memberDao;
	}	
	
	@Override
	public void signUp(MemberDto memberDto) {
		
		// 아이디 중복체크 
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원가입
		if(!isMember) {
			int result = memberDao.insertNewMember(memberDto);  // 0: 실패, 1: 성공
			
			if (result == 0) {
				System.out.println("죄송합니다. 회원가입 실패입니다. 잠시 후 다시 시도해주세요");
				
			} else {
				System.out.println("회원가입 성공했어요");
				
			}
			
		} else {
			System.out.println("이미 존재하는 ID입니다.");
			
		}
		
	}

	@Override
	public void signIn(MemberDto memberDto) {

		MemberDto searchedMemberDto =
				memberDao.searchMemberByMemIdMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			System.out.println("로그인 성공");
			
		} else {
			System.out.println("로그인 실패");
			
		}
	}

	@Override
	public void modipy(MemberDto memberDto) {
		
		MemberDto updatedMemberDto =
				memberDao.updateMemberByMemId(memberDto);
		if (updatedMemberDto != null) {
			System.out.println("정보수정 완료되었습니다");
			
		} else {
			System.out.println("정보수정 실패했습니다");
			
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {

		MemberDto deletedMemberDto =
				memberDao.deleteMemberByMemIdMemPw(memberDto);
		
		if (deletedMemberDto != null) {
			System.out.println("탈퇴처리 완료되었습니다");
			
		} else {
			System.out.println("탈퇴처리 실패했습니다");
			
		}
		
	}

	public boolean doAuthenticationByMemIdMemPw(MemberDto memberDto) {
		
		MemberDto dto = memberDao.searchMemberByMemIdMemPw(memberDto);
		
		
		return dto != null ? true : false;
	}

	
	
}
