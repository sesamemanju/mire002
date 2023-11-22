package java_basic;

import java.util.Scanner;

public class RockSissorPaper {

	public static void main(String[] args) {
		String com_rsp = ""; // 가위 0 바위 1 보 2
		int com_rsp_num = 0;
		
		String my_rsp = ""; // 가위 0 바위 1 보 2
		int my_rsp_num = 0;
		
		int menu = 0;
		String judge = ""; //이기면 1 비기면 0 지면 2
		
		//입력
		com_rsp_num = (int)(Math.random()*3);
		
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은");
		System.out.println("1.가위 2.바위 3.보");
		
		Scanner scanner = new Scanner(System.in);
		menu = scanner.nextInt();
		my_rsp_num = menu -1;
		
		if(com_rsp_num == ((my_rsp_num+1)%3)) { //패배
			judge = "졌습니다.";
		}else {
			if(com_rsp_num == my_rsp_num) { //비김
				judge = "비겼습니다.";
			
		}else { //승리
				judge = "이겼습니다.";
			}
		}
//		if(my_rsp_num == 0) {
//			my_rsp = "가위";
//		}else if(my_rsp_num == 1) {
//				my_rsp = "바위";
//			}else {
//				my_rsp = "보";
//			}
//		if(com_rsp_num == 0) {
//			com_rsp = "가위";
//		}else if(com_rsp_num == 1) {
//				com_rsp = "바위";
//			}else {
//				com_rsp = "보";
//			}
		
		switch (my_rsp_num) {
		case 0:
			my_rsp = "가위";
		break;
		case 1:
			my_rsp = "바위";
		break;
		case 2:
			my_rsp = "보";
			break;
		}
		switch (com_rsp_num) {
		case 0:
			com_rsp = "가위";
		break;
		case 1:
			com_rsp = "바위";
		break;
		case 2:
			com_rsp = "보";
			break;
		}
		
		//출력
		System.out.println("컴퓨터 : "+com_rsp);
		System.out.println("당신 : "+my_rsp);
		System.out.println(judge);
		
	}

}
