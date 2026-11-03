package com.office.game;

public class Bear implements ICharactor{

	public void walk(int x, int y) {
		
		System.out.printf("%d, %d 로 네발로 이동한다 \n", x, y);
		
	}

	@Override
	public void run(int x, int y) {
		System.out.printf("%d, %d 로 네발로 이동한다 \n", x, y);
		
	}
	
}
