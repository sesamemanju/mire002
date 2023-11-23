package java_basic;

import java.util.Scanner;

public class RockSissorPaper {

	public static void main(String[] args) {
		String com_rsp = ""; // 가위 0 바위 1 보 2
		int com_rsp_num = 0;

		String my_rsp = ""; // 가위 0 바위 1 보 2
		int my_rsp_num = 0;

		int menu = 0;
		String judge = ""; // 이기면 1 비기면 0 지면 2

		String quit = "";

		while (!quit.toUpperCase().equals("Q")) {

			// 입력
			com_rsp_num = (int) (Math.random() * 3);
			System.out.println("컴퓨터와 가위바위보를 해봅시다.");
			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은");
			System.out.println("1.가위 2.바위 3.보");

			Scanner scanner = new Scanner(System.in);
			while (true) {
				menu = scanner.nextInt(); scanner.nextLine();

				if (menu < 1 || menu > 3) {
					System.out.println("입력이 올바르지 않습니다.");
				} else{
					break;
				}
			}
			my_rsp_num = menu - 1;

			if (com_rsp_num == ((my_rsp_num + 1) % 3)) { // 패배
				judge = "졌습니다.";
			} else {
				if (com_rsp_num == my_rsp_num) { // 비김
					judge = "비겼습니다.";

				} else { // 승리
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

			// 출력
			System.out.println("컴퓨터 : " + com_rsp);
			System.out.println("당신 : " + my_rsp);
			System.out.println(judge);

			System.out.println("더 하시겠습니까?(그만하려면 Q)");
			System.out.println("계속하려면 아무 키나 누르세요.");

			quit = scanner.nextLine();

		}
	}

}
