package com.java.dto;

public class FireEngine extends Car{
	
	protected int wheel = 10;
	protected int waterTank;
	
	@Override
	public void speedUP() {
		System.out.println("자식 : 속도업");
	}

}
