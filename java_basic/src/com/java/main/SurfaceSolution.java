package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangleVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;


public class SurfaceSolution {
	
	private Shape s;
	private int menu;

	public static void main(String[] args) {
		
		PolyMain main = new PolyMain();
		
		do {
			main.input();	
			
			main.process();
			
			main.output();
		} while(true);
	}

	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("������ �����Ͻÿ�");
		System.out.println("1. �ﰢ��	2. �簢��	3.��");
		menu = scann.nextInt(); scann.nextLine();
		
		switch(menu) {
		case 1: //�ﰢ��
			s = new TriangleVO();
			TriangleVO t = (TriangleVO)s;
			System.out.print("�غ� : ");
			t.setBaseline(scann.nextInt());
			scann.nextLine();
			System.out.print("���� : ");
			t.setHeight(scann.nextInt());
			scann.nextLine();
			break;
		case 2: //�簢��
			s = new RectangleVO();
			RectangleVO r =(RectangleVO)s;
			System.out.print("���� : ");
			r.setBaseline(scann.nextInt());
			scann.nextLine();
			System.out.print("���� : ");
			r.setHeight(scann.nextInt());
			scann.nextLine();
			break;
		case 3: //��
			s = new CircleVO();
			CircleVO c = (CircleVO)s;
			System.out.print("������ : ");
			c.setRadius(scann.nextInt());
			scann.nextLine();
			break;
		default: 
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
		}
	}
		
		public void process() {
			switch(menu) {
			case 1:break;
			case 2:break;
			case 3:break;
			default: System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			}
		}
		
	public void output() {
		switch(menu) {
		case 1:
			System.out.println("�ﰢ�� ���� : ");
			break;
		case 2:
			System.out.println("�簢�� ���� : ");
			break;
		case 3:
			System.out.println("�� ���� : ");
			break;
		}
		
		System.out.print(s.surface());
		
		System.out.println("����(Q)Ȥ�� ����Ͻ÷��� �ƹ�Ű�� �����ÿ�.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
	
}


