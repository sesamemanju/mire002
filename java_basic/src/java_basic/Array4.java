package java_basic;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {

		final int STUDEN_NUM; // �����Ҵ縸 ������
		final int SUBJECT_NUM;

		Scanner scann = new Scanner(System.in);

		String[] name;
		String[] subject;
		int[][] score;
		int[] total;
		float[] evg;

		System.out.print("�л� �� :");
		STUDEN_NUM = scann.nextInt();
		scann.nextLine();

		System.out.print("���� �� :");
		SUBJECT_NUM = scann.nextInt();
		scann.nextLine();

		// ���� �ʱ�ȭ
		name = new String[STUDEN_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDEN_NUM][SUBJECT_NUM];
		total = new int[STUDEN_NUM];
		evg = new float[STUDEN_NUM];

		// ����� �Է�
		for (int i = 0; i < SUBJECT_NUM; i++) {
			System.out.println((i + 1) + "/" + SUBJECT_NUM + "��° ����� : ");
			subject[i] = scann.nextLine();
		}
		// �̸�/�����Է�
		for (int i = 0; i < STUDEN_NUM; i++) {
			System.out.println((i + 1) + "/" + STUDEN_NUM + " ��° �л� ���� �Է�");
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();

			for (int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(subject[j] + " : ");
				score[i][j] = scann.nextInt();
				scann.nextLine();
			} // ����
			System.out.println();
		} // �л�

		// ó��
		for (int i = 0; i < STUDEN_NUM; i++) {
			for (int j = 0; j < SUBJECT_NUM; j++) {
				total[i] = total[i] + score[i][j];
			}
			
			evg[i] = (int)(total[i]/(float)SUBJECT_NUM*100+0.5f)/100f;
			
		}

		//���
		// ��
		System.out.print("����\t�̸�\t");
		for(int i =0;i<SUBJECT_NUM;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.print("����\t���");
		
		System.out.println();
		
		// �л�����
		for(int i=0;i<STUDEN_NUM;i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for(int j=0;j<SUBJECT_NUM;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(total[i]+"\t"+evg[i]+"\n");
		}
		System.out.println();
	}

}
