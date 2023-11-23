package java_basic;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// 학생 수를 입력받고 그 학생수만큼 국어, 영어, 수학, 과학 점수를 입력받아 총점과 평균을 내는 프로그램

		Scanner scann = new Scanner(System.in);
		final int STUDENT_NUM;

		System.out.println("학생 수를 입력해 주세요.");
		System.out.print("학생 수 : ");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();

		String[] label = { "순번", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };

		String[] name = new String[STUDENT_NUM];
		int[] kor = new int[STUDENT_NUM];
		int[] eng = new int[STUDENT_NUM];
		int[] math = new int[STUDENT_NUM];
		int[] sci = new int[STUDENT_NUM];
		int[] total = new int[STUDENT_NUM];
		float[] avg = new float[STUDENT_NUM];

		// 입력
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println("학생" + (i + 1) + " 정보 입력");
			System.out.print("이름 : ");
			name[i] = scann.nextLine();
			System.out.print("국어 : ");
			kor[i] = scann.nextInt();
			scann.nextLine();
			System.out.print("영어 : ");
			eng[i] = scann.nextInt();
			scann.nextLine();
			System.out.print("수학 : ");
			math[i] = scann.nextInt();
			scann.nextLine();
			System.out.print("과학 : ");
			sci[i] = scann.nextInt();
			scann.nextLine();

		}

		// 처리
		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + sci[stuNum];
			avg[stuNum] = (int) ((total[stuNum] / 4f) * 100 + 0.5f) / 100f;
		}
		// 출력
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