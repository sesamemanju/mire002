package com.java.dto;

import java.util.Scanner;

public class TriangleVO extends Shape{

	public int height; // 높이
	public int baseline; // 밑변
	// 넓이 0의 개념으로 묵시적 초기화

	// 생성자를 만든 이유는 초기화를 이유로 함
	// 임의의 값을 넣어서 초기화를 하고있음

	// 0부터 10까지 숫자를 임의로 뽑아서 짝수면 0, 홀수면 1로 초기화
	{
		int temp = (int) (Math.random() * 11);
		if (temp % 2 == 0) {
			height = (baseline = 0);
		} else
			height = (baseline = 0);
	}

	public TriangleVO() {
	}
	
	public TriangleVO(int height, int baseline) { // 임의의 값을 받아서 초기화를 하고있음
		this.height = height;
		this.baseline = baseline;
	}
	@Override
	public int surface() {
		return (int) (height * baseline * 0.5f);
	} // static한 값을 낼 수 없기때문에 static을 넣으면 프로그램이 터짐..

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBaseline() {
		return baseline;
	}

	public void setBaseline(int baseline) {
		this.baseline = baseline;
	}

	@Override
	public void inputData() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		this.baseline = scann.nextInt();
		scann.nextLine();
		System.out.print("높이 : ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String outputMessage() {
		return "삼각형 넓이";
		
	}
	
	
	
}
