package java_basic;

import java.util.Scanner;

public class Homework1121 {

	public static void main(String[] args) {
		// 가위바위보 프로그램
		// 컴퓨터는 결정했습니다.
		// 당신의 선택은?
		// 0. 가위 1. 바위 2. 보
		//선택 : 2
		// 컴퓨터 : 가위
		// 당신 : 바위
		// 이겼습니다.
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("가위바위보 프로그램");
				
		double random = Math.random();
			
		int target = (int)(random*3);
		
		int siss = 0;
		int rock = 1;
		int pap = 2;
		
		
		System.out.println("컴퓨터는 결정했습니다");
		System.out.println("당신의 선택은?");
		System.out.print("0 = 가위 1 = 바위 2 = 보");
//		player = scann.nextInt();
		
		
		
//		if (target == player)
//		{ result = ("컴퓨터:" + target "당신:" + player);
//		System.out.println(result+"비겼습니다.");
//		} else if (target >= player) { result = ("컴퓨터 : "+target "당신 : "+player);
//		System.out.println(result+"졌습니다.");
//		} else(target <= player) { result = ("컴퓨터 : "+target "당신 : "+player);
//		System.out.println(result+"이겼습니다.");
//		}
			
			
//		System.out.println(target);
	}

}
