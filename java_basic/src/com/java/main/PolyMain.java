package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangleVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.solution.SurfaceSolution;

public class PolyMain {
	
	public TriangleVO triangle;
	public RectangleVO rectangle;
	public CircleVO circle;
	public int menu;

	public static void main(String[] args) {
		SurfaceSolution main = new SurfaceSolution();
		
		main.start();
		
	}

	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("������ �����Ͻÿ�");
		System.out.println("1. �ﰢ��	2. �簢��	3.��");
		menu = scann.nextInt(); scann.nextLine();
		
		switch(menu) {
		case 1: //�ﰢ��
			triangle = new TriangleVO();
			System.out.print("�غ� : ");
			triangle.baseline = scann.nextInt(); scann.nextLine();
			System.out.print("���� : ");
			triangle.height = scann.nextInt(); scann.nextLine();
			break;
		case 2: //�簢��
			rectangle = new RectangleVO();
			System.out.print("���� : ");
			rectangle.baseline = scann.nextInt(); scann.nextLine();
			System.out.print("���� : ");
			rectangle.height = scann.nextInt(); scann.nextLine();
			break;
		case 3: //��
			circle = new CircleVO();
			System.out.print("������ : ");
			circle.radius = scann.nextInt(); scann.nextLine();
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
			System.out.println("�ﰢ�� ���� : " + triangle.surface());
			break;
		case 2:
			System.out.println("�簢�� ���� : "+ rectangle.surface());
			break;
		case 3:
			System.out.println("�� ���� : "+ circle.surface());
			break;
		}
		System.out.println("����(Q)Ȥ�� ����Ͻ÷��� �ƹ�Ű�� �����ÿ�.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
	
}
