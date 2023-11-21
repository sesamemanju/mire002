package java_basic;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// 2의 배수인지 3의 배수인지 5의 배수인지 판별
		
		int inputInt = 0;
		String result = " ";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		inputInt = scan.nextInt();
		
		boolean condition = inputInt % 2 != 0
						 && inputInt % 3 != 0
						 && inputInt % 5 != 0;

		if(condition) {
			result = "2, 3, 5의 배수가 아닙니다.";
		}else {
			if(inputInt % 2 == 0) {
				result = result + "2";
			}else {
				if (inputInt % 3 == 0) {
					result = result + ", 3";
				}else {
					if(inputInt % 5 == 0) {
						result = result + ", 5 배수입니다.";
					}
				}
			}
			if(inputInt % 3 == 0) {
				result = result + "3";
			} else {
				if(inputInt % 5 == 0) {
					result = result + ", 5";
				}
			}
			if(inputInt % 5 == 0) {
				result = result + "5";
			}
			
			result = result + "의 배수입니다.";
		}
		
		System.out.println(result);
	}

}
