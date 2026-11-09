package com.office.home;

import java.util.HashMap;
import java.util.Scanner;

import com.office.Container;
import com.office.menu.Menu;
import com.office.session.Session;

public class HomeController {

	public void execute() {
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		
		while(systemFlag) {
			
			Menu.generateMenu();
			
			int seletedMenu = scanner.nextInt();
			
			switch (seletedMenu) {
			case Menu.MEMBER_SIGN_UP:			
			case Menu.MEMBER_SIGN_IN:
			case Menu.MEMBER_SIGN_OUT:			
			case Menu.MEMBER_MODIFY:				
			case Menu.MEMBER_DELETE:
				Container.getInstance().getMemberController().execute(scanner, seletedMenu);
				break;	
				
			case Menu.DIARY_WRITE:				
			case Menu.DIARY_READ:
				Container.getInstance().getDiaryController().execute(scanner, seletedMenu);
				break;	
				
			case Menu.SYSTEM_OUT:
				System.out.println("Good Bye~~");
				systemFlag = false;
				break;
			}
			
		}
						
		scanner.close();
	}

}
