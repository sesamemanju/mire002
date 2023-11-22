package java_basic;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// 입력한 정수만큼 '*'를 찍는 프로그램
		
		int inputnum = 0;
		Scanner scann = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해 주세요");
		inputnum = scann.nextInt();
		
		String result="";
		for(int i=0;i<inputnum;i++) {
			result=result+"*";
		}
		System.out.println(result);
	}

}
