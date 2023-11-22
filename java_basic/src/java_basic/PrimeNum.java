package java_basic;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// 임의의 숫자를 입력받아 소수인지 확인하는 프로그램을 작성하시오.
		
		
		int num = 0;
		boolean isPrimeNum = true;
		
		Scanner scann = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해 주세요.");
		num = scann.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				isPrimeNum = false;
			}
		}
		
		if(isPrimeNum) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
	}

}
