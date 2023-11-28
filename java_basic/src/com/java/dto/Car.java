package com.java.dto;

public class Car {
	
	protected int wheel=4;
	protected int breakk=4;
	protected int acell=4;
	// proteted는 같은 패키지나 상속관계면 쓸수있음 default + Overriding
	
	public void speedUP() {
		System.out.println("부모 : 속도업");
	}
	public void speedDown() {
		System.out.println("부모 : 속도다운");
	}

}
