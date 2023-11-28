package com.java.dto;

import java.util.Scanner;

public class RectangleVO extends Shape {

	public int baseline; // �غ�
	public int height; // ����
//	public float width;// ����

	// �Է�

	public RectangleVO() {
	}

	public RectangleVO(int baseline, int height) {
		this.baseline = baseline;
		this.height = height;
	}
	@Override
	public int surface() {
		return (int) (baseline * height);
	}

	public int getBaseline() {
		return baseline;
	}

	public void setBaseline(int baseline) {
		this.baseline = baseline;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void inputData() {
		Scanner scann = new Scanner(System.in);
		System.out.print("���� : ");
		this.baseline = scann.nextInt();
		scann.nextLine();
		System.out.print("���� : ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String outputMessage() {
		return "�簢�� ����";
		
	}

}
