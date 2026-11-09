package com.office;

import com.office.home.HomeController;

public class MainClass {

	public static void main(String[] args) {
		
		Container.getInstance().getHomeController().execute();
		
	}
	
}
