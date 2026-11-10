package com.office;

import com.office.config.Config;
import com.office.dumy.Dumy;
import com.office.home.HomeController;

public class MainClass {

	public static void main(String[] args) {
		
		// assemble
		Container container = Container.getInstance();
		
		// set dumy
		if (Config.IS_DEV) {
			new Dumy().setDumy();
		}
		
		// 실행
		container.getHomeController().execute();
		
	}
	
}
