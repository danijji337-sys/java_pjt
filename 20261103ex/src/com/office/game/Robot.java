package com.office.game;

public class Robot implements ICharactor{

	@Override
	public void run(int x, int y) {
		
		System.out.printf("%d, %d 로 두발로 이동한다 \n", x, y);
		
	}

	
}
