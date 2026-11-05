package com.office.diary;

public class DiaryAssembler {

	private static DiaryAssembler drAssembler;
	
	final private DiaryDao DIARY_DAO = new DiaryDao();
	final private DiaryService DIARY_SERVICE = new DiaryService(DIARY_DAO);
	final private DiaryController DIARY_CONTROLLER = new DiaryController(DIARY_SERVICE);
	
	
	private DiaryAssembler() {}
	
	public static DiaryAssembler getinstance() {
		if (drAssembler == null) {
			drAssembler = new DiaryAssembler();
		}
		
		return drAssembler;
	}

	public DiaryController getDiaryController() {
		return DIARY_CONTROLLER;
	}

	public DiaryService getDiaryService() {
		return DIARY_SERVICE;
	}

	public DiaryDao getDiaryDao() {
		return DIARY_DAO;
	}
	
	
	
}
