package java_basic;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// ������ ���ڸ� �Է¹޾� �Ҽ����� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		
		int num = 0;
		boolean isPrimeNum = true;
		
		Scanner scann = new Scanner(System.in);
		System.out.println("������ ������ �Է��� �ּ���.");
		num = scann.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				isPrimeNum = false;
			}
		}
		
		if(isPrimeNum) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		
	}

}
