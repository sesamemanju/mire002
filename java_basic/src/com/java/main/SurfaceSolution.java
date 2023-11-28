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
		System.out.println("도형을 선택하시오");
		System.out.println("1. 삼각형	2. 사각형	3.원");
		menu = scann.nextInt(); scann.nextLine();
		
		switch(menu) {
		case 1: //삼각형
			s = new TriangleVO();
			TriangleVO t = (TriangleVO)s;
			System.out.print("밑변 : ");
			t.setBaseline(scann.nextInt());
			scann.nextLine();
			System.out.print("높이 : ");
			t.setHeight(scann.nextInt());
			scann.nextLine();
			break;
		case 2: //사각형
			s = new RectangleVO();
			RectangleVO r =(RectangleVO)s;
			System.out.print("가로 : ");
			r.setBaseline(scann.nextInt());
			scann.nextLine();
			System.out.print("세로 : ");
			r.setHeight(scann.nextInt());
			scann.nextLine();
			break;
		case 3: //원
			s = new CircleVO();
			CircleVO c = (CircleVO)s;
			System.out.print("반지름 : ");
			c.setRadius(scann.nextInt());
			scann.nextLine();
			break;
		default: 
			System.out.println("입력이 올바르지 않습니다.");
		}
	}
		
		public void process() {
			switch(menu) {
			case 1:break;
			case 2:break;
			case 3:break;
			default: System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			}
		}
		
	public void output() {
		switch(menu) {
		case 1:
			System.out.println("삼각형 넓이 : ");
			break;
		case 2:
			System.out.println("사각형 넓이 : ");
			break;
		case 3:
			System.out.println("원 넓이 : ");
			break;
		}
		
		System.out.print(s.surface());
		
		System.out.println("종료(Q)혹은 계속하시려면 아무키나 누르시오.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
	
}


