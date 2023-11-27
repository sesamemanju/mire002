package com.java.dto;

import java.util.Scanner;

public class ScoreVO {

	public String name; // static 붙이지 않은 이유: 인스턴스마다 값이 같지 않음.
	public int math;    // static 붙이게되면 인스턴스 전부 같은값이 됨.
	public int kor;
	public int eng;
	public int sci;

	public int total() {
		return kor + math + eng + sci;
	}

	public float evg() {
		return ((int) (total() / 4f * 100 + 0.5)) / 100f;
	}

	public void input() {
		Scanner scann = new Scanner(System.in);

		System.out.print("이름 : ");
		name = scann.nextLine();

		System.out.println("국어 : ");
		kor = scann.nextInt();
		scann.nextLine(); // 인스턴스를 지칭할 수 있는 "레퍼런스"만 잡아줌

		System.out.println("영어 : ");
		eng = scann.nextInt();
		scann.nextLine();

		System.out.println("수학 : ");
		math = scann.nextInt();
		scann.nextLine();

		System.out.println("과학 : ");
		sci = scann.nextInt();
		scann.nextLine();
	}

	//가진것만 표현하기때문에 순번 없음. 값이 변하지 않으므로 static을 사용함.
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}

	public void printScore() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sci + "\t" + total() + "\t" + evg());

	}
}
