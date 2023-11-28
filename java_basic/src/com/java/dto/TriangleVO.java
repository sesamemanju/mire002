package com.java.dto;

import java.util.Scanner;

public class TriangleVO extends Shape{

	public int height; // ����
	public int baseline; // �غ�
	// ���� 0�� �������� ������ �ʱ�ȭ

	// �����ڸ� ���� ������ �ʱ�ȭ�� ������ ��
	// ������ ���� �־ �ʱ�ȭ�� �ϰ�����

	// 0���� 10���� ���ڸ� ���Ƿ� �̾Ƽ� ¦���� 0, Ȧ���� 1�� �ʱ�ȭ
	{
		int temp = (int) (Math.random() * 11);
		if (temp % 2 == 0) {
			height = (baseline = 0);
		} else
			height = (baseline = 0);
	}

	public TriangleVO() {
	}
	
	public TriangleVO(int height, int baseline) { // ������ ���� �޾Ƽ� �ʱ�ȭ�� �ϰ�����
		this.height = height;
		this.baseline = baseline;
	}
	@Override
	public int surface() {
		return (int) (height * baseline * 0.5f);
	} // static�� ���� �� �� ���⶧���� static�� ������ ���α׷��� ����..

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
		
		System.out.print("�غ� : ");
		this.baseline = scann.nextInt();
		scann.nextLine();
		System.out.print("���� : ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String outputMessage() {
		return "�ﰢ�� ����";
		
	}
	
	
	
}
