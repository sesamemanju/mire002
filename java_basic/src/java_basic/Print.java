package java_basic;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// �Է��� ������ŭ '*'�� ��� ���α׷�
		
		int inputnum = 0;
		Scanner scann = new Scanner(System.in);
		System.out.println("������ ������ �Է��� �ּ���");
		inputnum = scann.nextInt();
		
		String result="";
		for(int i=0;i<inputnum;i++) {
			result=result+"*";
		}
		System.out.println(result);
	}

}
