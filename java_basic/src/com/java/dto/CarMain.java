package com.java.dto;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		car.speedUP();
		car.speedDown();
		System.out.println(car.wheel);
		System.out.println("------------------------------");
		
		FireEngine f = new FireEngine();
		car = f;
		
		car.speedUP();
		car.speedDown();
		System.out.println(car.wheel);
		System.out.println(((FireEngine)car).wheel);
	}
	

	private static FireEngine FireEngine() {
		// TODO Auto-generated method stub
		return null;
	}

}
