package java_basic;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// �л� ���� �Է¹ް� �� �л�����ŭ ����, ����, ����, ���� ������ �Է¹޾� ������ ����� ���� ���α׷�

		Scanner scann = new Scanner(System.in);
		final int STUDENT_NUM;

		System.out.println("�л� ���� �Է��� �ּ���.");
		System.out.print("�л� �� : ");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();

		String[] label = { "����", "�̸�", "����", "����", "����", "����", "����", "���" };

		String[] name = new String[STUDENT_NUM];
		int[] kor = new int[STUDENT_NUM];
		int[] eng = new int[STUDENT_NUM];
		int[] math = new int[STUDENT_NUM];
		int[] sci = new int[STUDENT_NUM];
		int[] total = new int[STUDENT_NUM];
		float[] avg = new float[STUDENT_NUM];

		// �Է�
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println("�л�" + (i + 1) + " ���� �Է�");
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();
			System.out.print("���� : ");
			kor[i] = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			eng[i] = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			math[i] = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			sci[i] = scann.nextInt();
			scann.nextLine();

		}

		// ó��
		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + sci[stuNum];
			avg[stuNum] = (int) ((total[stuNum] / 4f) * 100 + 0.5f) / 100f;
		}
		// ���
		for (int i = 0; i < label.length; i++) {
			System.out.print(label[i] + "\t");
		}
		System.out.println();
		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			System.out.println(stuNum + "\t" + name[stuNum] + "\t" + kor[stuNum] + "\t" + eng[stuNum] + "\t"
					+ math[stuNum] + "\t" + sci[stuNum] + "\t" + total[stuNum] + "\t" + avg[stuNum] + "\t");
		}

	}
}