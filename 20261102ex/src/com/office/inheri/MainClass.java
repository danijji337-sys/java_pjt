package com.office.inheri;

import com.office.inheri.restaurant.ChildRestaurant;

public class MainClass {

	public static void main(String[] args) {
		

		
		ChildRestaurant childRestaurant = 
				new ChildRestaurant();
		childRestaurant.makeJajang(ChildRestaurant.CHILD_MENU);  //true면 아들꺼 false면 아빠꺼
		childRestaurant.makeJjamppong();
		childRestaurant.makeBokkeumbap();
		childRestaurant.makeTangsuyuk();
		
	}
	
}
