package com.java.dto;

import java.util.Scanner;

public class ScoreVO {

	public String name; // static ������ ���� ����: �ν��Ͻ����� ���� ���� ����.
	public int math;    // static ���̰ԵǸ� �ν��Ͻ� ���� �������� ��.
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

		System.out.print("�̸� : ");
		name = scann.nextLine();

		System.out.println("���� : ");
		kor = scann.nextInt();
		scann.nextLine(); // �ν��Ͻ��� ��Ī�� �� �ִ� "���۷���"�� �����

		System.out.println("���� : ");
		eng = scann.nextInt();
		scann.nextLine();

		System.out.println("���� : ");
		math = scann.nextInt();
		scann.nextLine();

		System.out.println("���� : ");
		sci = scann.nextInt();
		scann.nextLine();
	}

	//�����͸� ǥ���ϱ⶧���� ���� ����. ���� ������ �����Ƿ� static�� �����.
	public static void printLabel() {
		System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
	}

	public void printScore() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sci + "\t" + total() + "\t" + evg());

	}
}
