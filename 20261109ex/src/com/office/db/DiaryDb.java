package com.office.db;

import java.util.ArrayList;
import java.util.HashMap;

import com.office.diary.DiaryDto;
import com.office.member.MemberDto;

public class DiaryDb {

	private static DiaryDb diaryDb;
	
	final private HashMap<String, MemberDto> members;
	final private HashMap<String, ArrayList<DiaryDto>> Diaries;
	
	private DiaryDb() {
		members = new HashMap<String, MemberDto>();
		Diaries = new HashMap<String, ArrayList<DiaryDto>>();
	}
	
	public static DiaryDb getInstance() {
		if(diaryDb == null)
			diaryDb = new DiaryDb();
		
		return diaryDb;
	}

	/*
	 *  getter
	 */
	
	public HashMap<String, MemberDto> getMembers() {
		return members;
	}

	public HashMap<String, ArrayList<DiaryDto>> getDiaries() {
		return Diaries;
	}
	
	
	
}
