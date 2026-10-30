package com.office.ex;

public class Daeri {
	
	public String name = "kim Daeri";
	private int money;
	
	public Daeri() {
		money = 1000000;		
	}

	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다");
		System.out.println(money + "원 지급 완료!!");
	}
	
	public void setMoney(int money, String ceoPW) {
		
		if (ceoPW.equals("1234")) {
			this.money = money;
		}
			
	}
	
	public int getMoney() {
		
		return this.money;
		
	}
	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
