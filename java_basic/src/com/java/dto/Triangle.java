package com.java.dto;

import java.util.Scanner;

public class Triangle{
		
		public float base; //�غ�
		public float height; //����
		public float width; //����
		
		//�Է�
		public float width() {
			return (base * height);
		}
		
		public void input() {
			Scanner scann = new Scanner(System.in);
			
			System.out.print("�غ� ���� : ");
			base = scann.nextFloat();
			scann.nextLine();
			
			System.out.print("���� : ");
			height = scann.nextFloat();
			scann.nextLine();
			
			
		}
}
