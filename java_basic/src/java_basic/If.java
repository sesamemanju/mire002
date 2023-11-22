package java_basic;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 임의의 정수 하나를 입력받아 홀수 혹은 짝수인지를 판별하는 프로그램을 작성하시오
		// 결과) 정수 하나를 입력하시오
		// 5
		// 입력한 정수 5는 홀수입니다.
		// 결과) 정수 하나를 입력하시오
		// 4
		// 입력한 정수 4는 짝수입니다.
		
		int integer=0;
		char juge = ' ';
		
		Scanner scann = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오.");
		integer = scann.nextInt();
		
		if(integer % 2 > 0) {
			juge = '홀';
		}else {
			juge = '짝';
		}
		
		
		
		System.out.println("입력한 숫자"+integer+"는 "+juge+"수 입니다.");
		
		
		
		
	}

}
