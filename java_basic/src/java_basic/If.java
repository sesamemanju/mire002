package java_basic;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// ������ ���� �ϳ��� �Է¹޾� Ȧ�� Ȥ�� ¦�������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�
		// ���) ���� �ϳ��� �Է��Ͻÿ�
		// 5
		// �Է��� ���� 5�� Ȧ���Դϴ�.
		// ���) ���� �ϳ��� �Է��Ͻÿ�
		// 4
		// �Է��� ���� 4�� ¦���Դϴ�.
		
		int integer=0;
		char juge = ' ';
		
		Scanner scann = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ�.");
		integer = scann.nextInt();
		
		if(integer % 2 > 0) {
			juge = 'Ȧ';
		}else {
			juge = '¦';
		}
		
		
		
		System.out.println("�Է��� ����"+integer+"�� "+juge+"�� �Դϴ�.");
		
		
		
		
	}

}
