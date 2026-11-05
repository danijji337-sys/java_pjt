package com.office.diary;

import java.util.Scanner;

public class DiaryController implements IDiaryConfig{

    final private DiaryService diaryService;
    
    public DiaryController (DiaryService diaryService) {		
    	this.diaryService = diaryService;    	
	}

	public void execute() {
		Scanner scanner = new Scanner(System.in);
		boolean systemflag = true;
		
		while (systemflag) {
			System.out.println("1.Write   2.Read    99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch(selectedMenuNum) {
			
			case DIARY_WRITE:
				
				scanner.nextLine();
				
				System.out.println("INPUT NEW DIARY TEXT");
				String txt = scanner.nextLine();
				
				DiaryDto diaryDto = new DiaryDto(txt);
				
				diaryService.WriteNewDiary(diaryDto);
				
				break;
				
			case DIARY_READ:
				
				diaryService.readDiary();
				
				break;
				
			case SYSTEM_OUT:
				
				systemflag = false;
				
				break;
			
			}
			
			
		}
		
		scanner.close();
	}
	
}
